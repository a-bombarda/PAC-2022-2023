Dopo aver compilato e aver ottenuto i file .class, 
la corretta sintassi per eseguire i progetti è:

 > java XMLSAXLookup corso_x.xml
 > java SaxParserEmployee employees.xml
 
E' possibile anche impostare gli argomenti del comando java da Eclipse:
 1) right-click sul progetto
 2) Run as -> run configurations
 3) nel menu a sinistra selezionare una delle due applicazioni (es: XMLSAXLookup)
 4) Selezionare la tendina "Arguments"
 5) nel campo "program arguments" digitare gli argomenti (es: corso_x.xml)

NB: tutto ciò che viene scritto in "program arguments" viene passato come argomento al 
comando java, dopo il nome dell'eseguibile. 