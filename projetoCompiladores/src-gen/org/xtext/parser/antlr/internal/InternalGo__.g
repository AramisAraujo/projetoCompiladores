lexer grammar InternalGo;

@header {
package org.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T__166 : 'Hello' ;
T__167 : '!' ;

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 144
fragment RULE_NEWLINE : '\n';

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 146
fragment RULE_UNICODE_CHAR : ('A'..'Z'|'a'..'z'|'\u00AA'|'\u00B5'|'\u00BA'|'\u00C0'..'\u00D6'|'\u00D8'..'\u00F6'|'\u00F8'..'\u02C1'|'\u02C6'..'\u02D1'|'\u02E0'..'\u02E4'|'\u02EC'|'\u02EE'|'\u0370'..'\u0374'|'\u0376'..'\u0377'|'\u037A'..'\u037D'|'\u037F'|'\u0386'|'\u0388'..'\u038A'|'\u038C'|'\u038E'..'\u03A1'|'\u03A3'..'\u03F5'|'\u03F7'..'\u0481'|'\u048A'..'\u052F'|'\u0531'..'\u0556'|'\u0559'|'\u0561'..'\u0587'|'\u05D0'..'\u05EA'|'\u05F0'..'\u05F2'|'\u0620'..'\u064A'|'\u066E'..'\u066F'|'\u0671'..'\u06D3'|'\u06D5'|'\u06E5'..'\u06E6'|'\u06EE'..'\u06EF'|'\u06FA'..'\u06FC'|'\u06FF'|'\u0710'|'\u0712'..'\u072F'|'\u074D'..'\u07A5'|'\u07B1'|'\u07CA'..'\u07EA'|'\u07F4'..'\u07F5'|'\u07FA'|'\u0800'..'\u0815'|'\u081A'|'\u0824'|'\u0828'|'\u0840'..'\u0858'|'\u08A0'..'\u08B2'|'\u0904'..'\u0939'|'\u093D'|'\u0950'|'\u0958'..'\u0961'|'\u0971'..'\u0980'|'\u0985'..'\u098C'|'\u098F'..'\u0990'|'\u0993'..'\u09A8'|'\u09AA'..'\u09B0'|'\u09B2'|'\u09B6'..'\u09B9'|'\u09BD'|'\u09CE'|'\u09DC'..'\u09DD'|'\u09DF'..'\u09E1'|'\u09F0'..'\u09F1'|'\u0A05'..'\u0A0A'|'\u0A0F'..'\u0A10'|'\u0A13'..'\u0A28'|'\u0A2A'..'\u0A30'|'\u0A32'..'\u0A33'|'\u0A35'..'\u0A36'|'\u0A38'..'\u0A39'|'\u0A59'..'\u0A5C'|'\u0A5E'|'\u0A72'..'\u0A74'|'\u0A85'..'\u0A8D'|'\u0A8F'..'\u0A91'|'\u0A93'..'\u0AA8'|'\u0AAA'..'\u0AB0'|'\u0AB2'..'\u0AB3'|'\u0AB5'..'\u0AB9'|'\u0ABD'|'\u0AD0'|'\u0AE0'..'\u0AE1'|'\u0B05'..'\u0B0C'|'\u0B0F'..'\u0B10'|'\u0B13'..'\u0B28'|'\u0B2A'..'\u0B30'|'\u0B32'..'\u0B33'|'\u0B35'..'\u0B39'|'\u0B3D'|'\u0B5C'..'\u0B5D'|'\u0B5F'..'\u0B61'|'\u0B71'|'\u0B83'|'\u0B85'..'\u0B8A'|'\u0B8E'..'\u0B90'|'\u0B92'..'\u0B95'|'\u0B99'..'\u0B9A'|'\u0B9C'|'\u0B9E'..'\u0B9F'|'\u0BA3'..'\u0BA4'|'\u0BA8'..'\u0BAA'|'\u0BAE'..'\u0BB9'|'\u0BD0'|'\u0C05'..'\u0C0C'|'\u0C0E'..'\u0C10'|'\u0C12'..'\u0C28'|'\u0C2A'..'\u0C39'|'\u0C3D'|'\u0C58'..'\u0C59'|'\u0C60'..'\u0C61'|'\u0C85'..'\u0C8C'|'\u0C8E'..'\u0C90'|'\u0C92'..'\u0CA8'|'\u0CAA'..'\u0CB3'|'\u0CB5'..'\u0CB9'|'\u0CBD'|'\u0CDE'|'\u0CE0'..'\u0CE1'|'\u0CF1'..'\u0CF2'|'\u0D05'..'\u0D0C'|'\u0D0E'..'\u0D10'|'\u0D12'..'\u0D3A'|'\u0D3D'|'\u0D4E'|'\u0D60'..'\u0D61'|'\u0D7A'..'\u0D7F'|'\u0D85'..'\u0D96'|'\u0D9A'..'\u0DB1'|'\u0DB3'..'\u0DBB'|'\u0DBD'|'\u0DC0'..'\u0DC6'|'\u0E01'..'\u0E30'|'\u0E32'..'\u0E33'|'\u0E40'..'\u0E46'|'\u0E81'..'\u0E82'|'\u0E84'|'\u0E87'..'\u0E88'|'\u0E8A'|'\u0E8D'|'\u0E94'..'\u0E97'|'\u0E99'..'\u0E9F'|'\u0EA1'..'\u0EA3'|'\u0EA5'|'\u0EA7'|'\u0EAA'..'\u0EAB'|'\u0EAD'..'\u0EB0'|'\u0EB2'..'\u0EB3'|'\u0EBD'|'\u0EC0'..'\u0EC4'|'\u0EC6'|'\u0EDC'..'\u0EDF'|'\u0F00'|'\u0F40'..'\u0F47'|'\u0F49'..'\u0F6C'|'\u0F88'..'\u0F8C'|'\u1000'..'\u102A'|'\u103F'|'\u1050'..'\u1055'|'\u105A'..'\u105D'|'\u1061'|'\u1065'..'\u1066'|'\u106E'..'\u1070'|'\u1075'..'\u1081'|'\u108E'|'\u10A0'..'\u10C5'|'\u10C7'|'\u10CD'|'\u10D0'..'\u10FA'|'\u10FC'..'\u1248'|'\u124A'..'\u124D'|'\u1250'..'\u1256'|'\u1258'|'\u125A'..'\u125D'|'\u1260'..'\u1288'|'\u128A'..'\u128D'|'\u1290'..'\u12B0'|'\u12B2'..'\u12B5'|'\u12B8'..'\u12BE'|'\u12C0'|'\u12C2'..'\u12C5'|'\u12C8'..'\u12D6'|'\u12D8'..'\u1310'|'\u1312'..'\u1315'|'\u1318'..'\u135A'|'\u1380'..'\u138F'|'\u13A0'..'\u13F4'|'\u1401'..'\u166C'|'\u166F'..'\u167F'|'\u1681'..'\u169A'|'\u16A0'..'\u16EA'|'\u16F1'..'\u16F8'|'\u1700'..'\u170C'|'\u170E'..'\u1711'|'\u1720'..'\u1731'|'\u1740'..'\u1751'|'\u1760'..'\u176C'|'\u176E'..'\u1770'|'\u1780'..'\u17B3'|'\u17D7'|'\u17DC'|'\u1820'..'\u1877'|'\u1880'..'\u18A8'|'\u18AA'|'\u18B0'..'\u18F5'|'\u1900'..'\u191E'|'\u1950'..'\u196D'|'\u1970'..'\u1974'|'\u1980'..'\u19AB'|'\u19C1'..'\u19C7'|'\u1A00'..'\u1A16'|'\u1A20'..'\u1A54'|'\u1AA7'|'\u1B05'..'\u1B33'|'\u1B45'..'\u1B4B'|'\u1B83'..'\u1BA0'|'\u1BAE'..'\u1BAF'|'\u1BBA'..'\u1BE5'|'\u1C00'..'\u1C23'|'\u1C4D'..'\u1C4F'|'\u1C5A'..'\u1C7D'|'\u1CE9'..'\u1CEC'|'\u1CEE'..'\u1CF1'|'\u1CF5'..'\u1CF6'|'\u1D00'..'\u1DBF'|'\u1E00'..'\u1F15'|'\u1F18'..'\u1F1D'|'\u1F20'..'\u1F45'|'\u1F48'..'\u1F4D'|'\u1F50'..'\u1F57'|'\u1F59'|'\u1F5B'|'\u1F5D'|'\u1F5F'..'\u1F7D'|'\u1F80'..'\u1FB4'|'\u1FB6'..'\u1FBC'|'\u1FBE'|'\u1FC2'..'\u1FC4'|'\u1FC6'..'\u1FCC'|'\u1FD0'..'\u1FD3'|'\u1FD6'..'\u1FDB'|'\u1FE0'..'\u1FEC'|'\u1FF2'..'\u1FF4'|'\u1FF6'..'\u1FFC'|'\u2071'|'\u207F'|'\u2090'..'\u209C'|'\u2102'|'\u2107'|'\u210A'..'\u2113'|'\u2115'|'\u2119'..'\u211D'|'\u2124'|'\u2126'|'\u2128'|'\u212A'..'\u212D'|'\u212F'..'\u2139'|'\u213C'..'\u213F'|'\u2145'..'\u2149'|'\u214E'|'\u2C00'..'\u2C2E'|'\u2C30'..'\u2C5E'|'\u2C60'..'\u2CE4'|'\u2CEB'..'\u2CEE'|'\u2CF2'..'\u2CF3'|'\u2D00'..'\u2D25'|'\u2D27'|'\u2D2D'|'\u2D30'..'\u2D67'|'\u2D6F'|'\u2D80'..'\u2D96'|'\u2DA0'..'\u2DA6'|'\u2DA8'..'\u2DAE'|'\u2DB0'..'\u2DB6'|'\u2DB8'..'\u2DBE'|'\u2DC0'..'\u2DC6'|'\u2DC8'..'\u2DCE'|'\u2DD0'..'\u2DD6'|'\u2DD8'..'\u2DDE'|'\u2E2F'|'\u3005'..'\u3006'|'\u3031'..'\u3035'|'\u303B'..'\u303C'|'\u3041'..'\u3096'|'\u309D'..'\u309F'|'\u30A1'..'\u30FA'|'\u30FC'..'\u30FF'|'\u3105'..'\u312D'|'\u3131'..'\u318E'|'\u31A0'..'\u31BA'|'\u31F0'..'\u31FF'|'\u3400'..'\u4DB5'|'\u4E00'..'\u9FCC'|'\uA000'..'\uA48C'|'\uA4D0'..'\uA4FD'|'\uA500'..'\uA60C'|'\uA610'..'\uA61F'|'\uA62A'..'\uA62B'|'\uA640'..'\uA66E'|'\uA67F'..'\uA69D'|'\uA6A0'..'\uA6E5'|'\uA717'..'\uA71F'|'\uA722'..'\uA788'|'\uA78B'..'\uA78E'|'\uA790'..'\uA7AD'|'\uA7B0'..'\uA7B1'|'\uA7F7'..'\uA801'|'\uA803'..'\uA805'|'\uA807'..'\uA80A'|'\uA80C'..'\uA822'|'\uA840'..'\uA873'|'\uA882'..'\uA8B3'|'\uA8F2'..'\uA8F7'|'\uA8FB'|'\uA90A'..'\uA925'|'\uA930'..'\uA946'|'\uA960'..'\uA97C'|'\uA984'..'\uA9B2'|'\uA9CF'|'\uA9E0'..'\uA9E4'|'\uA9E6'..'\uA9EF'|'\uA9FA'..'\uA9FE'|'\uAA00'..'\uAA28'|'\uAA40'..'\uAA42'|'\uAA44'..'\uAA4B'|'\uAA60'..'\uAA76'|'\uAA7A'|'\uAA7E'..'\uAAAF'|'\uAAB1'|'\uAAB5'..'\uAAB6'|'\uAAB9'..'\uAABD'|'\uAAC0'|'\uAAC2'|'\uAADB'..'\uAADD'|'\uAAE0'..'\uAAEA'|'\uAAF2'..'\uAAF4'|'\uAB01'..'\uAB06'|'\uAB09'..'\uAB0E'|'\uAB11'..'\uAB16'|'\uAB20'..'\uAB26'|'\uAB28'..'\uAB2E'|'\uAB30'..'\uAB5A'|'\uAB5C'..'\uAB5F'|'\uAB64'..'\uAB65'|'\uABC0'..'\uABE2'|'\uAC00'..'\uD7A3'|'\uD7B0'..'\uD7C6'|'\uD7CB'..'\uD7FB'|'\uF900'..'\uFA6D'|'\uFA70'..'\uFAD9'|'\uFB00'..'\uFB06'|'\uFB13'..'\uFB17'|'\uFB1D'|'\uFB1F'..'\uFB28'|'\uFB2A'..'\uFB36'|'\uFB38'..'\uFB3C'|'\uFB3E'|'\uFB40'..'\uFB41'|'\uFB43'..'\uFB44'|'\uFB46'..'\uFBB1'|'\uFBD3'..'\uFD3D'|'\uFD50'..'\uFD8F'|'\uFD92'..'\uFDC7'|'\uFDF0'..'\uFDFB'|'\uFE70'..'\uFE74'|'\uFE76'..'\uFEFC'|'\uFF21'..'\uFF3A'|'\uFF41'..'\uFF5A'|'\uFF66'..'\uFFBE'|'\uFFC2'..'\uFFC7'|'\uFFCA'..'\uFFCF'|'\uFFD2'..'\uFFD7'|'\uFFDA'..'\uFFDC');

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 148
fragment RULE_UNICODE_LETTER : ('A'..'Z'|'a'..'z'|'\u00AA'|'\u00B5'|'\u00BA'|'\u00C0'..'\u00D6'|'\u00D8'..'\u00F6'|'\u00F8'..'\u02C1'|'\u02C6'..'\u02D1'|'\u02E0'..'\u02E4'|'\u02EC'|'\u02EE'|'\u0370'..'\u0374'|'\u0376'..'\u0377'|'\u037A'..'\u037D'|'\u037F'|'\u0386'|'\u0388'..'\u038A'|'\u038C'|'\u038E'..'\u03A1'|'\u03A3'..'\u03F5'|'\u03F7'..'\u0481'|'\u048A'..'\u052F'|'\u0531'..'\u0556'|'\u0559'|'\u0561'..'\u0587'|'\u05D0'..'\u05EA'|'\u05F0'..'\u05F2'|'\u0620'..'\u064A'|'\u066E'..'\u066F'|'\u0671'..'\u06D3'|'\u06D5'|'\u06E5'..'\u06E6'|'\u06EE'..'\u06EF'|'\u06FA'..'\u06FC'|'\u06FF'|'\u0710'|'\u0712'..'\u072F'|'\u074D'..'\u07A5'|'\u07B1'|'\u07CA'..'\u07EA'|'\u07F4'..'\u07F5'|'\u07FA'|'\u0800'..'\u0815'|'\u081A'|'\u0824'|'\u0828'|'\u0840'..'\u0858'|'\u08A0'..'\u08B2'|'\u0904'..'\u0939'|'\u093D'|'\u0950'|'\u0958'..'\u0961'|'\u0971'..'\u0980'|'\u0985'..'\u098C'|'\u098F'..'\u0990'|'\u0993'..'\u09A8'|'\u09AA'..'\u09B0'|'\u09B2'|'\u09B6'..'\u09B9'|'\u09BD'|'\u09CE'|'\u09DC'..'\u09DD'|'\u09DF'..'\u09E1'|'\u09F0'..'\u09F1'|'\u0A05'..'\u0A0A'|'\u0A0F'..'\u0A10'|'\u0A13'..'\u0A28'|'\u0A2A'..'\u0A30'|'\u0A32'..'\u0A33'|'\u0A35'..'\u0A36'|'\u0A38'..'\u0A39'|'\u0A59'..'\u0A5C'|'\u0A5E'|'\u0A72'..'\u0A74'|'\u0A85'..'\u0A8D'|'\u0A8F'..'\u0A91'|'\u0A93'..'\u0AA8'|'\u0AAA'..'\u0AB0'|'\u0AB2'..'\u0AB3'|'\u0AB5'..'\u0AB9'|'\u0ABD'|'\u0AD0'|'\u0AE0'..'\u0AE1'|'\u0B05'..'\u0B0C'|'\u0B0F'..'\u0B10'|'\u0B13'..'\u0B28'|'\u0B2A'..'\u0B30'|'\u0B32'..'\u0B33'|'\u0B35'..'\u0B39'|'\u0B3D'|'\u0B5C'..'\u0B5D'|'\u0B5F'..'\u0B61'|'\u0B71'|'\u0B83'|'\u0B85'..'\u0B8A'|'\u0B8E'..'\u0B90'|'\u0B92'..'\u0B95'|'\u0B99'..'\u0B9A'|'\u0B9C'|'\u0B9E'..'\u0B9F'|'\u0BA3'..'\u0BA4'|'\u0BA8'..'\u0BAA'|'\u0BAE'..'\u0BB9'|'\u0BD0'|'\u0C05'..'\u0C0C'|'\u0C0E'..'\u0C10'|'\u0C12'..'\u0C28'|'\u0C2A'..'\u0C39'|'\u0C3D'|'\u0C58'..'\u0C59'|'\u0C60'..'\u0C61'|'\u0C85'..'\u0C8C'|'\u0C8E'..'\u0C90'|'\u0C92'..'\u0CA8'|'\u0CAA'..'\u0CB3'|'\u0CB5'..'\u0CB9'|'\u0CBD'|'\u0CDE'|'\u0CE0'..'\u0CE1'|'\u0CF1'..'\u0CF2'|'\u0D05'..'\u0D0C'|'\u0D0E'..'\u0D10'|'\u0D12'..'\u0D3A'|'\u0D3D'|'\u0D4E'|'\u0D60'..'\u0D61'|'\u0D7A'..'\u0D7F'|'\u0D85'..'\u0D96'|'\u0D9A'..'\u0DB1'|'\u0DB3'..'\u0DBB'|'\u0DBD'|'\u0DC0'..'\u0DC6'|'\u0E01'..'\u0E30'|'\u0E32'..'\u0E33'|'\u0E40'..'\u0E46'|'\u0E81'..'\u0E82'|'\u0E84'|'\u0E87'..'\u0E88'|'\u0E8A'|'\u0E8D'|'\u0E94'..'\u0E97'|'\u0E99'..'\u0E9F'|'\u0EA1'..'\u0EA3'|'\u0EA5'|'\u0EA7'|'\u0EAA'..'\u0EAB'|'\u0EAD'..'\u0EB0'|'\u0EB2'..'\u0EB3'|'\u0EBD'|'\u0EC0'..'\u0EC4'|'\u0EC6'|'\u0EDC'..'\u0EDF'|'\u0F00'|'\u0F40'..'\u0F47'|'\u0F49'..'\u0F6C'|'\u0F88'..'\u0F8C'|'\u1000'..'\u102A'|'\u103F'|'\u1050'..'\u1055'|'\u105A'..'\u105D'|'\u1061'|'\u1065'..'\u1066'|'\u106E'..'\u1070'|'\u1075'..'\u1081'|'\u108E'|'\u10A0'..'\u10C5'|'\u10C7'|'\u10CD'|'\u10D0'..'\u10FA'|'\u10FC'..'\u1248'|'\u124A'..'\u124D'|'\u1250'..'\u1256'|'\u1258'|'\u125A'..'\u125D'|'\u1260'..'\u1288'|'\u128A'..'\u128D'|'\u1290'..'\u12B0'|'\u12B2'..'\u12B5'|'\u12B8'..'\u12BE'|'\u12C0'|'\u12C2'..'\u12C5'|'\u12C8'..'\u12D6'|'\u12D8'..'\u1310'|'\u1312'..'\u1315'|'\u1318'..'\u135A'|'\u1380'..'\u138F'|'\u13A0'..'\u13F4'|'\u1401'..'\u166C'|'\u166F'..'\u167F'|'\u1681'..'\u169A'|'\u16A0'..'\u16EA'|'\u16EE'..'\u16F8'|'\u1700'..'\u170C'|'\u170E'..'\u1711'|'\u1720'..'\u1731'|'\u1740'..'\u1751'|'\u1760'..'\u176C'|'\u176E'..'\u1770'|'\u1780'..'\u17B3'|'\u17D7'|'\u17DC'|'\u1820'..'\u1877'|'\u1880'..'\u18A8'|'\u18AA'|'\u18B0'..'\u18F5'|'\u1900'..'\u191E'|'\u1950'..'\u196D'|'\u1970'..'\u1974'|'\u1980'..'\u19AB'|'\u19C1'..'\u19C7'|'\u1A00'..'\u1A16'|'\u1A20'..'\u1A54'|'\u1AA7'|'\u1B05'..'\u1B33'|'\u1B45'..'\u1B4B'|'\u1B83'..'\u1BA0'|'\u1BAE'..'\u1BAF'|'\u1BBA'..'\u1BE5'|'\u1C00'..'\u1C23'|'\u1C4D'..'\u1C4F'|'\u1C5A'..'\u1C7D'|'\u1CE9'..'\u1CEC'|'\u1CEE'..'\u1CF1'|'\u1CF5'..'\u1CF6'|'\u1D00'..'\u1DBF'|'\u1E00'..'\u1F15'|'\u1F18'..'\u1F1D'|'\u1F20'..'\u1F45'|'\u1F48'..'\u1F4D'|'\u1F50'..'\u1F57'|'\u1F59'|'\u1F5B'|'\u1F5D'|'\u1F5F'..'\u1F7D'|'\u1F80'..'\u1FB4'|'\u1FB6'..'\u1FBC'|'\u1FBE'|'\u1FC2'..'\u1FC4'|'\u1FC6'..'\u1FCC'|'\u1FD0'..'\u1FD3'|'\u1FD6'..'\u1FDB'|'\u1FE0'..'\u1FEC'|'\u1FF2'..'\u1FF4'|'\u1FF6'..'\u1FFC'|'\u2071'|'\u207F'|'\u2090'..'\u209C'|'\u2102'|'\u2107'|'\u210A'..'\u2113'|'\u2115'|'\u2119'..'\u211D'|'\u2124'|'\u2126'|'\u2128'|'\u212A'..'\u212D'|'\u212F'..'\u2139'|'\u213C'..'\u213F'|'\u2145'..'\u2149'|'\u214E'|'\u2160'..'\u2188'|'\u2C00'..'\u2C2E'|'\u2C30'..'\u2C5E'|'\u2C60'..'\u2CE4'|'\u2CEB'..'\u2CEE'|'\u2CF2'..'\u2CF3'|'\u2D00'..'\u2D25'|'\u2D27'|'\u2D2D'|'\u2D30'..'\u2D67'|'\u2D6F'|'\u2D80'..'\u2D96'|'\u2DA0'..'\u2DA6'|'\u2DA8'..'\u2DAE'|'\u2DB0'..'\u2DB6'|'\u2DB8'..'\u2DBE'|'\u2DC0'..'\u2DC6'|'\u2DC8'..'\u2DCE'|'\u2DD0'..'\u2DD6'|'\u2DD8'..'\u2DDE'|'\u2E2F'|'\u3005'..'\u3007'|'\u3021'..'\u3029'|'\u3031'..'\u3035'|'\u3038'..'\u303C'|'\u3041'..'\u3096'|'\u309D'..'\u309F'|'\u30A1'..'\u30FA'|'\u30FC'..'\u30FF'|'\u3105'..'\u312D'|'\u3131'..'\u318E'|'\u31A0'..'\u31BA'|'\u31F0'..'\u31FF'|'\u3400'..'\u4DB5'|'\u4E00'..'\u9FCC'|'\uA000'..'\uA48C'|'\uA4D0'..'\uA4FD'|'\uA500'..'\uA60C'|'\uA610'..'\uA61F'|'\uA62A'..'\uA62B'|'\uA640'..'\uA66E'|'\uA67F'..'\uA69D'|'\uA6A0'..'\uA6EF'|'\uA717'..'\uA71F'|'\uA722'..'\uA788'|'\uA78B'..'\uA78E'|'\uA790'..'\uA7AD'|'\uA7B0'..'\uA7B1'|'\uA7F7'..'\uA801'|'\uA803'..'\uA805'|'\uA807'..'\uA80A'|'\uA80C'..'\uA822'|'\uA840'..'\uA873'|'\uA882'..'\uA8B3'|'\uA8F2'..'\uA8F7'|'\uA8FB'|'\uA90A'..'\uA925'|'\uA930'..'\uA946'|'\uA960'..'\uA97C'|'\uA984'..'\uA9B2'|'\uA9CF'|'\uA9E0'..'\uA9E4'|'\uA9E6'..'\uA9EF'|'\uA9FA'..'\uA9FE'|'\uAA00'..'\uAA28'|'\uAA40'..'\uAA42'|'\uAA44'..'\uAA4B'|'\uAA60'..'\uAA76'|'\uAA7A'|'\uAA7E'..'\uAAAF'|'\uAAB1'|'\uAAB5'..'\uAAB6'|'\uAAB9'..'\uAABD'|'\uAAC0'|'\uAAC2'|'\uAADB'..'\uAADD'|'\uAAE0'..'\uAAEA'|'\uAAF2'..'\uAAF4'|'\uAB01'..'\uAB06'|'\uAB09'..'\uAB0E'|'\uAB11'..'\uAB16'|'\uAB20'..'\uAB26'|'\uAB28'..'\uAB2E'|'\uAB30'..'\uAB5A'|'\uAB5C'..'\uAB5F'|'\uAB64'..'\uAB65'|'\uABC0'..'\uABE2'|'\uAC00'..'\uD7A3'|'\uD7B0'..'\uD7C6'|'\uD7CB'..'\uD7FB'|'\uF900'..'\uFA6D'|'\uFA70'..'\uFAD9'|'\uFB00'..'\uFB06'|'\uFB13'..'\uFB17'|'\uFB1D'|'\uFB1F'..'\uFB28'|'\uFB2A'..'\uFB36'|'\uFB38'..'\uFB3C'|'\uFB3E'|'\uFB40'..'\uFB41'|'\uFB43'..'\uFB44'|'\uFB46'..'\uFBB1'|'\uFBD3'..'\uFD3D'|'\uFD50'..'\uFD8F'|'\uFD92'..'\uFDC7'|'\uFDF0'..'\uFDFB'|'\uFE70'..'\uFE74'|'\uFE76'..'\uFEFC'|'\uFF21'..'\uFF3A'|'\uFF41'..'\uFF5A'|'\uFF66'..'\uFFBE'|'\uFFC2'..'\uFFC7'|'\uFFCA'..'\uFFCF'|'\uFFD2'..'\uFFD7'|'\uFFDA'..'\uFFDC');

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 150
fragment RULE_UNICODE_DIGIT : ('0'..'9'|'\u0660'..'\u0669'|'\u06F0'..'\u06F9'|'\u07C0'..'\u07C9'|'\u0966'..'\u096F'|'\u09E6'..'\u09EF'|'\u0A66'..'\u0A6F'|'\u0AE6'..'\u0AEF'|'\u0B66'..'\u0B6F'|'\u0BE6'..'\u0BEF'|'\u0C66'..'\u0C6F'|'\u0CE6'..'\u0CEF'|'\u0D66'..'\u0D6F'|'\u0DE6'..'\u0DEF'|'\u0E50'..'\u0E59'|'\u0ED0'..'\u0ED9'|'\u0F20'..'\u0F29'|'\u1040'..'\u1049'|'\u1090'..'\u1099'|'\u17E0'..'\u17E9'|'\u1810'..'\u1819'|'\u1946'..'\u194F'|'\u19D0'..'\u19D9'|'\u1A80'..'\u1A89'|'\u1A90'..'\u1A99'|'\u1B50'..'\u1B59'|'\u1BB0'..'\u1BB9'|'\u1C40'..'\u1C49'|'\u1C50'..'\u1C59'|'\uA620'..'\uA629'|'\uA8D0'..'\uA8D9'|'\uA900'..'\uA909'|'\uA9D0'..'\uA9D9'|'\uA9F0'..'\uA9F9'|'\uAA50'..'\uAA59'|'\uABF0'..'\uABF9'|'\uFF10'..'\uFF19');

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 152
fragment RULE_LETTER : (RULE_UNICODE_LETTER|'_');

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 154
fragment RULE_DECIMAL_DIGIT : '0'..'9';

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 156
fragment RULE_OCTAL_DIGIT : '0'..'7';

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 158
fragment RULE_HEX_DIGIT : ('0'..'9'|'A'..'F'|'a'..'f');

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 160
fragment RULE_KEYWORDS : ('break'|'default'|'func'|'interface'|'select'|'case'|'defer'|'go'|'map'|'struct'|'chan'|'else'|'goto'|'package'|'switch'|'const'|'fallthrough'|'if'|'range'|'type'|'continue'|'for'|'import'|'return'|'var');

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 162
fragment RULE_IDENTIFIER : RULE_LETTER (RULE_LETTER|RULE_UNICODE_DIGIT)*;

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 164
fragment RULE_OPERATORS : ('+'|'&'|'+='|'&='|'&&'|'=='|'!='|'('|')'|'-'|'|'|'-='|'|='|'||'|'<'|'<='|'['|']'|'*'|'^'|'*='|'^='|'<-'|'>'|'>='|'{'|'}'|'/'|'<<'|'/='|'<<='|'++'|'='|':='|','|';'|'%'|'>>'|'%='|'>>='|'--'|'!'|'...'|'.'|':'|'&^'|'&^='|RULE_ASSIGN_OP);

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 166
fragment RULE_INT_LIT : (RULE_DECIMAL_LIT|RULE_OCTAL_LIT|RULE_HEX_LIT);

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 168
fragment RULE_DECIMAL_LIT : '1'..'9' RULE_DECIMAL_DIGIT*;

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 170
fragment RULE_OCTAL_LIT : '0' RULE_OCTAL_DIGIT*;

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 172
fragment RULE_HEX_LIT : '0' ('x'|'X') RULE_HEX_DIGIT RULE_HEX_DIGIT*;

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 174
fragment RULE_FLOAT_LIT : (RULE_DECIMALS '.' RULE_DECIMALS? RULE_EXPONENT?|RULE_DECIMALS RULE_EXPONENT|'.' RULE_DECIMALS RULE_EXPONENT?);

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 176
fragment RULE_DECIMALS : RULE_DECIMAL_DIGIT RULE_DECIMAL_DIGIT*;

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 178
fragment RULE_EXPONENT : ('e'|'E') ('+'|'-')? RULE_DECIMALS;

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 180
fragment RULE_IMAGINARY_LIT : (RULE_DECIMALS|RULE_FLOAT_LIT) 'i';

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 182
fragment RULE_RUNE_LIT : '\'' (RULE_UNICODE_VALUE|RULE_BYTE_VALUE) '\'';

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 184
fragment RULE_UNICODE_VALUE : (RULE_UNICODE_CHAR|RULE_LITTLE_U_VALUE|RULE_BIG_U_VALUE|RULE_ESCAPED_CHAR);

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 186
fragment RULE_BYTE_VALUE : (RULE_OCTAL_BYTE_VALUE|RULE_HEX_BYTE_VALUE);

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 188
fragment RULE_OCTAL_BYTE_VALUE : '\\' RULE_OCTAL_DIGIT RULE_OCTAL_DIGIT RULE_OCTAL_DIGIT;

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 190
fragment RULE_HEX_BYTE_VALUE : '\\' 'x' RULE_HEX_DIGIT RULE_HEX_DIGIT;

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 192
fragment RULE_LITTLE_U_VALUE : '\\' 'u' RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT;

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 194
fragment RULE_BIG_U_VALUE : '\\' 'U' RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT;

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 196
fragment RULE_ESCAPED_CHAR : '\\' ('a'|'b'|'f'|'n'|'r'|'t'|'v'|'\\'|'\''|'"');

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 198
fragment RULE_STRING_LIT : (RULE_RAW_STRING_LIT|RULE_INTERPRETED_STRING_LIT);

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 200
fragment RULE_RAW_STRING_LIT : '`' (RULE_UNICODE_CHAR|RULE_NEWLINE)* '`';

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 202
fragment RULE_INTERPRETED_STRING_LIT : '"' (RULE_UNICODE_VALUE|RULE_BYTE_VALUE)* '"';

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 204
fragment RULE_LITERALS : (RULE_INT_LIT|RULE_FLOAT_LIT|RULE_IMAGINARY_LIT|RULE_RUNE_LIT|RULE_STRING_LIT);

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 206
RULE_COMMENT : ('//' ( options {greedy=false;} : . )*RULE_NEWLINE|'/*' ( options {greedy=false;} : . )*'*/');

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 208
fragment RULE_SEMICOLON : ';';

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 210
RULE_TOKEN : (RULE_IDENTIFIER|RULE_KEYWORDS|RULE_OPERATORS|RULE_LITERALS);

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 212
fragment RULE_TYPE : (RULE_TYPE_NAME|RULE_TYPE_LIT|'(' RULE_TYPE ')');

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 214
fragment RULE_TYPE_NAME : (RULE_IDENTIFIER|RULE_QUALIFIED_IDENT);

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 216
fragment RULE_TYPE_LIT : (RULE_ARRAY_TYPE|RULE_STRUCT_TYPE|RULE_POINTER_TYPE|RULE_FUNCTION_TYPE|RULE_INTERFACE_TYPE|RULE_SLICE_TYPE|RULE_MAP_TYPE|RULE_PARAMETER_LIST);

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 218
fragment RULE_ARRAY_TYPE : '[' RULE_ARRAY_LENTGH ']' RULE_ELEMENT_TYPE;

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 220
fragment RULE_ARRAY_LENTGH : RULE_PARAMETER_LIST;

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 222
fragment RULE_ELEMENT_TYPE : RULE_TYPE;

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 224
fragment RULE_STRUCT_TYPE : 'struct' '{' (RULE_FIELD_DECL ';')* '}';

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 226
fragment RULE_FIELD_DECL : (RULE_IDENTIFIER_LIST RULE_TYPE|RULE_EMBEDDED_FIELD) RULE_TAG?;

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 228
fragment RULE_EMBEDDED_FIELD : '*'+ RULE_TYPE_NAME;

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 230
fragment RULE_TAG : RULE_STRING_LIT;

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 232
fragment RULE_POINTER_TYPE : '*' RULE_BASE_TYPE;

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 234
fragment RULE_BASE_TYPE : RULE_TYPE;

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 236
fragment RULE_FUNCTION_TYPE : 'func' RULE_SIGNATURE;

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 238
fragment RULE_SIGNATURE : RULE_PARAMETERS RULE_RESULT+;

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 240
fragment RULE_RESULT : (RULE_PARAMETERS|RULE_TYPE);

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 242
fragment RULE_PARAMETERS : '(' (RULE_PARAMETER_LIST ','+)+ ')';

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 244
fragment RULE_PARAMETER_LIST : RULE_PARAMETER_DECL (',' RULE_PARAMETER_DECL)*;

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 246
fragment RULE_PARAMETER_DECL : RULE_IDENTIFIER_LIST? '...'? RULE_TYPE;

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 248
fragment RULE_INTERFACE_TYPE : 'interface' '{' (RULE_METHOD_SPEC ';')* '}';

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 250
fragment RULE_METHOD_SPEC : (RULE_METHOD_NAME RULE_SIGNATURE|RULE_INTERFACE_TYPE_NAME);

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 252
fragment RULE_METHOD_NAME : RULE_IDENTIFIER;

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 254
fragment RULE_INTERFACE_TYPE_NAME : RULE_TYPE_NAME;

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 256
fragment RULE_SLICE_TYPE : '[' ']' RULE_ELEMENT_TYPE;

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 258
fragment RULE_MAP_TYPE : 'map' '[' RULE_KEY_TYPE ']' RULE_ELEMENT_TYPE;

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 260
fragment RULE_KEY_TYPE : RULE_TYPE;

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 262
RULE_CHANNEL_TYPE : ('chan'|'chan' '<-'|'<-' 'chan') RULE_ELEMENT_TYPE;

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 264
fragment RULE_BLOCK : '{' RULE_STATEMENT_LIST '}';

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 266
fragment RULE_STATEMENT_LIST : (RULE_STATEMENT ';')*;

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 268
fragment RULE_DECLARATION : (RULE_CONST_DECL|RULE_TYPE_DECL|RULE_VAR_DECL);

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 270
fragment RULE_TOP_LEVEL_DECL : (RULE_DECLARATION|RULE_FUNCTION_DECL|RULE_METHOD_DECL);

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 272
fragment RULE_CONST_DECL : 'const' (RULE_CONST_SPEC|'(' (RULE_CONST_SPEC ';')* ')');

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 274
fragment RULE_CONST_SPEC : RULE_IDENTIFIER_LIST (RULE_TYPE? '=' RULE_EXPRESSION_LIST)?;

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 276
fragment RULE_IDENTIFIER_LIST : RULE_IDENTIFIER (',' RULE_IDENTIFIER)*;

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 278
fragment RULE_EXPRESSION_LIST : RULE_EXPRESSION (',' RULE_EXPRESSION)*;

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 280
fragment RULE_TYPE_DECL : 'type' (RULE_TYPE_SPEC|'(' (RULE_TYPE_SPEC ';')* ')');

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 282
fragment RULE_TYPE_SPEC : (RULE_ALIAS_DECL|RULE_TYPE_DEF);

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 284
fragment RULE_ALIAS_DECL : RULE_IDENTIFIER '=' RULE_TYPE;

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 286
fragment RULE_TYPE_DEF : RULE_IDENTIFIER RULE_TYPE;

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 288
fragment RULE_VAR_DECL : 'var' (RULE_VAR_SPEC|'(' (RULE_VAR_SPEC ';')* ')');

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 290
fragment RULE_VAR_SPEC : RULE_IDENTIFIER_LIST (RULE_TYPE ('=' RULE_EXPRESSION_LIST)?|'=' RULE_EXPRESSION_LIST);

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 292
fragment RULE_SHORT_VAR_DECL : RULE_IDENTIFIER_LIST ':=' RULE_EXPRESSION_LIST;

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 294
fragment RULE_FUNCTION_DECL : 'func' RULE_FUNCTION_NAME RULE_SIGNATURE RULE_FUNCTION_BODY?;

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 296
fragment RULE_FUNCTION_NAME : RULE_IDENTIFIER;

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 298
fragment RULE_FUNCTION_BODY : RULE_BLOCK;

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 300
fragment RULE_METHOD_DECL : 'func' RULE_RECIEVER RULE_METHOD_NAME RULE_SIGNATURE RULE_FUNCTION_BODY?;

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 302
fragment RULE_RECIEVER : RULE_PARAMETERS;

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 304
fragment RULE_OPERAND : (RULE_LITERAL|RULE_OPERAND_NAME|'(' RULE_EXPRESSION ')');

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 306
fragment RULE_LITERAL : (RULE_BASIC_LIT|RULE_COMPOSITE_LIT|RULE_FUNCTION_LIT);

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 308
fragment RULE_BASIC_LIT : (RULE_INT_LIT|RULE_FLOAT_LIT|RULE_IMAGINARY_LIT|RULE_RUNE_LIT|RULE_STRING_LIT);

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 310
fragment RULE_OPERAND_NAME : (RULE_IDENTIFIER|RULE_QUALIFIED_IDENT);

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 312
fragment RULE_QUALIFIED_IDENT : RULE_PACKAGE_NAME '.' RULE_IDENTIFIER;

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 314
fragment RULE_COMPOSITE_LIT : RULE_LITERAL_TYPE RULE_LITERAL_VALUE;

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 316
fragment RULE_LITERAL_TYPE : (RULE_STRUCT_TYPE|RULE_ARRAY_TYPE|'[' '...' ']' RULE_ELEMENT_TYPE|RULE_SLICE_TYPE|RULE_MAP_TYPE|RULE_TYPE_NAME);

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 318
fragment RULE_LITERAL_VALUE : '{' (RULE_ELEMENT_LIST ','?)? '}';

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 320
fragment RULE_ELEMENT_LIST : RULE_KEYED_ELEMENT (',' RULE_KEYED_ELEMENT)*;

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 322
fragment RULE_KEYED_ELEMENT : (RULE_KEY ':')? RULE_ELEMENT;

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 324
fragment RULE_KEY : (RULE_FIELD_NAME|RULE_EXPRESSION|RULE_LITERAL_VALUE);

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 326
fragment RULE_FIELD_NAME : RULE_IDENTIFIER;

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 328
fragment RULE_ELEMENT : (RULE_EXPRESSION|RULE_LITERAL_VALUE);

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 330
fragment RULE_FUNCTION_LIT : 'func' RULE_SIGNATURE RULE_FUNCTION_BODY;

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 332
fragment RULE_PRIMARY_EXPR : (RULE_OPERAND|RULE_CONVERSION|RULE_METHOD_EXPR|RULE_PRIMARY_EXPR RULE_SELECTOR|RULE_PRIMARY_EXPR RULE_INDEX|RULE_PRIMARY_EXPR RULE_SLICE|RULE_PRIMARY_EXPR RULE_TYPE_ASSERTION|RULE_PRIMARY_EXPR RULE_ARGUMENTS);

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 334
fragment RULE_SELECTOR : '.' RULE_IDENTIFIER;

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 336
fragment RULE_INDEX : '[' RULE_EXPRESSION ']';

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 338
fragment RULE_SLICE : ('[' RULE_EXPRESSION? ':' RULE_EXPRESSION? ']'|'[' RULE_EXPRESSION? ':' RULE_EXPRESSION ':' RULE_EXPRESSION ']');

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 340
fragment RULE_TYPE_ASSERTION : '.' '(' RULE_TYPE ')';

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 342
fragment RULE_ARGUMENTS : '(' (RULE_EXPRESSION_LIST|RULE_TYPE (',' RULE_EXPRESSION_LIST)? '...'? ','?)? ')';

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 344
fragment RULE_METHOD_EXPR : RULE_RECIEVER_TYPE '.' RULE_METHOD_NAME;

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 346
fragment RULE_RECIEVER_TYPE : RULE_TYPE;

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 348
fragment RULE_EXPRESSION : (RULE_UNARY_EXPR|RULE_EXPRESSION RULE_BINARY_OP RULE_EXPRESSION);

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 350
fragment RULE_UNARY_EXPR : (RULE_PRIMARY_EXPR|RULE_UNARY_OP RULE_UNARY_EXPR);

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 352
fragment RULE_BINARY_OP : ('||'|'&&'|RULE_REL_OP|RULE_ADD_OP|RULE_MUL_OP);

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 354
fragment RULE_REL_OP : ('=='|'!='|'<'|'<='|'>'|'>=');

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 356
fragment RULE_ADD_OP : ('+'|'-'|'|'|'^');

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 358
fragment RULE_MUL_OP : ('*'|'/'|'%'|'<<'|'>>'|'&'|'&^');

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 360
fragment RULE_UNARY_OP : ('+'|'-'|'!'|'^'|'*'|'&'|'<-');

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 362
fragment RULE_CONVERSION : RULE_TYPE '(' RULE_EXPRESSION ','? ')';

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 364
fragment RULE_STATEMENT : (RULE_DECLARATION|RULE_LABELED_STMT|RULE_SIMPLE_STMT|RULE_GO_STMT|RULE_RETURN_STMT|RULE_BREAK_STMT|RULE_CONTINUE_STMT|RULE_GOTO_STMT|RULE_FALLTHROUGH_STMT|RULE_BLOCK|RULE_IF_STMT|RULE_SWITCH_STMT|RULE_SELECT_STMT|RULE_FOR_STMT|RULE_DEFER_STMT);

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 366
fragment RULE_SIMPLE_STMT : (RULE_EMPTY_STMT|RULE_EXPRESSION_STMT|RULE_SEND_STMT|RULE_INC_DEC_STMT|RULE_ASSIGNMENT|RULE_SHORT_VAR_DECL);

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 368
fragment RULE_EMPTY_STMT : ' '*;

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 370
fragment RULE_LABELED_STMT : RULE_LABEL ':' RULE_STATEMENT;

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 372
fragment RULE_LABEL : RULE_IDENTIFIER;

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 374
fragment RULE_EXPRESSION_STMT : RULE_EXPRESSION;

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 376
fragment RULE_SEND_STMT : RULE_CHANNEL '<-' RULE_EXPRESSION;

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 378
fragment RULE_CHANNEL : RULE_EXPRESSION;

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 380
fragment RULE_INC_DEC_STMT : RULE_EXPRESSION ('++'|'--');

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 382
fragment RULE_ASSIGNMENT : RULE_EXPRESSION_LIST RULE_ASSIGN_OP RULE_EXPRESSION_LIST;

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 384
fragment RULE_ASSIGN_OP : (RULE_ADD_OP|RULE_MUL_OP)? '=';

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 386
fragment RULE_IF_STMT : 'if' (RULE_SIMPLE_STMT ';')? RULE_EXPRESSION RULE_BLOCK ('else' (RULE_IF_STMT|RULE_BLOCK))?;

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 388
fragment RULE_SWITCH_STMT : (RULE_EXPR_SWITCH_STMT|RULE_TYPE_SWITCH_STMT);

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 390
fragment RULE_EXPR_SWITCH_STMT : 'switch' (RULE_SIMPLE_STMT ';')? RULE_EXPRESSION? '{' RULE_EXPR_CASE_CLAUSE* '}';

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 392
fragment RULE_EXPR_CASE_CLAUSE : RULE_EXPR_SWITCH_CASE ':' RULE_STATEMENT_LIST;

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 394
fragment RULE_EXPR_SWITCH_CASE : ('case' RULE_EXPRESSION_LIST|'default');

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 396
fragment RULE_TYPE_SWITCH_STMT : 'switch' (RULE_SIMPLE_STMT ';')? RULE_TYPE_SWITCH_GUARD '{' RULE_TYPE_CASE_CLAUSE* '}';

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 398
fragment RULE_TYPE_SWITCH_GUARD : (RULE_IDENTIFIER ':=')? RULE_PRIMARY_EXPR '.' '(' 'type' ')';

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 400
fragment RULE_TYPE_CASE_CLAUSE : RULE_TYPE_SWITCH_CASE ':' RULE_STATEMENT_LIST;

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 402
fragment RULE_TYPE_SWITCH_CASE : ('case' RULE_TYPE_LIST|'default');

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 404
fragment RULE_TYPE_LIST : RULE_TYPE (',' RULE_TYPE)*;

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 406
fragment RULE_FOR_STMT : 'for' (RULE_CONDITION|RULE_FOR_CLAUSE|RULE_RANGE_CLAUSE)? RULE_BLOCK;

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 408
fragment RULE_CONDITION : RULE_EXPRESSION;

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 410
fragment RULE_FOR_CLAUSE : RULE_INIT_STMT? ';' RULE_CONDITION? ';' RULE_POST_STMT?;

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 412
fragment RULE_INIT_STMT : RULE_SIMPLE_STMT;

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 414
fragment RULE_POST_STMT : RULE_SIMPLE_STMT;

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 416
fragment RULE_RANGE_CLAUSE : (RULE_EXPRESSION_LIST '='|RULE_IDENTIFIER_LIST ':=')? 'range' RULE_EXPRESSION;

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 418
fragment RULE_GO_STMT : 'go' RULE_EXPRESSION;

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 420
fragment RULE_SELECT_STMT : 'select' '{' RULE_COMM_CLAUSE* '}';

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 422
fragment RULE_COMM_CLAUSE : RULE_COMM_CASE ':' RULE_STATEMENT_LIST;

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 424
fragment RULE_COMM_CASE : ('case' (RULE_SEND_STMT|RULE_RECV_STMT)|'default');

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 426
fragment RULE_RECV_STMT : (RULE_EXPRESSION_LIST '='|RULE_IDENTIFIER_LIST ':=')? RULE_RECV_EXPR;

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 428
fragment RULE_RECV_EXPR : RULE_EXPRESSION;

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 430
fragment RULE_RETURN_STMT : 'return' RULE_EXPRESSION_LIST?;

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 432
fragment RULE_BREAK_STMT : 'break' RULE_LABEL?;

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 434
fragment RULE_CONTINUE_STMT : 'continue' RULE_LABEL?;

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 436
fragment RULE_GOTO_STMT : 'goto' RULE_LABEL;

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 438
fragment RULE_FALLTHROUGH_STMT : 'fallthrough';

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 440
fragment RULE_DEFER_STMT : 'defer' RULE_EXPRESSION;

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 442
RULE_SOURCE_FILE : RULE_PACKAGE_CLAUSE ';' (RULE_IMPORT_DECL ';')* (RULE_TOP_LEVEL_DECL ';')*;

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 444
fragment RULE_PACKAGE_CLAUSE : 'package' RULE_PACKAGE_NAME;

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 446
fragment RULE_PACKAGE_NAME : RULE_IDENTIFIER;

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 448
fragment RULE_IMPORT_DECL : 'import' (RULE_IMPORT_SPEC|'(' (RULE_IMPORT_SPEC ';')* ')');

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 450
fragment RULE_IMPORT_SPEC : ('.'|RULE_PACKAGE_NAME)? RULE_IMPORT_PATH;

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 452
fragment RULE_IMPORT_PATH : RULE_STRING_LIT;

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 454
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 456
RULE_INT : ('0'..'9')+;

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 458
RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 460
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 462
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 464
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g" 466
RULE_ANY_OTHER : .;
