var entrada = require('fs').readFileSync('/dev/stdin', 'utf8');
var linhas = entrada.split('\n');

var raio = Number(linhas.shift());
var area = (raio * raio * 3.14159).toFixed(4);
   
console.log(`A=${(area)}`);
