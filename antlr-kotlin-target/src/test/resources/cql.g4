grammar cql;

//query language losely based on CQL https://www.loc.gov/standards/sru/cql/spec.html
CUSTOM_QUERY_TOKEN : 'name' | 'lastname';

//TOKENS
LIKE : 'like' | '=' ;
EQUALS : 'eq' | 'equals' | 'exact' | 'is' ;
GT : 'greater' | '>' | 'after' ;
LT : 'smaller' | '<' | 'before' ;
RANGE_TOK: 'between' ;
AND : 'and' | 'AND' ;

fragment DATE_SEP : '-' ;
DATE_DDMM : [0-9][0-9]DATE_SEP[0-9][0-9] ;
DATE_DDMMYYYY : [0-9][0-9]DATE_SEP[0-9][0-9]DATE_SEP[0-9][0-9][0-9][0-9] ;
Number : [0-9]+ ;
fragment SpecialChars : [$_%&-:] ;
fragment Unicode: '0'..'9'
                      | 'a'..'z'
                      | 'A'..'Z'
                      | SpecialChars
                      | '\u0080'..'\uffff' ;
fragment Unicode_With_Space : Unicode | ' ' ;
String : Unicode+ ;
QuotedString : '"'Unicode_With_Space+ '"';
UNICODE_WS : [\p{White_Space}] -> skip; // match all Unicode whitespace


//in the future we can add other known identifiers or CharString1
identifier : CUSTOM_QUERY_TOKEN | String ;

numericValue : Number ;
dateValue : DATE_DDMM | DATE_DDMMYYYY ;
textValue : String | QuotedString | identifier;

textComparator : LIKE | EQUALS ;
numericComparator : textComparator | GT | LT ;
dateComparator : textComparator | GT | LT ;

range :  numericRange | dateRange ;
numericRange : RANGE_TOK numericValue AND numericValue ;
dateRange : RANGE_TOK dateValue AND dateValue ;

term : numericComparator numericValue | dateComparator dateValue | textComparator textValue;
searchterm : identifier term | identifier range;
searchTermList : searchterm (AND searchterm)* EOF;
