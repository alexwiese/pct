DEFINE OUTPUT PARAMETER foo1 AS CHARACTER NO-UNDO.
DEFINE OUTPUT PARAMETER foo2 AS CHARACTER NO-UNDO.
DEFINE OUTPUT PARAMETER foo3 AS CHARACTER NO-UNDO.
ASSIGN foo1 = '123'
       foo2 = '456'
       foo3 = 'ABC'.
RETURN '0'.