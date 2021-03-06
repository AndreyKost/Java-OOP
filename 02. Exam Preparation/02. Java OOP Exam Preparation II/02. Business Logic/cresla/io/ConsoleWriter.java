package cresla.io;

import cresla.interfaces.OutputWriter;

public class ConsoleWriter implements OutputWriter {

    public ConsoleWriter() {
    }

    @Override
    public void write(String output) {
        System.out.print(output);
    }

    @Override
    public void writeLine(String output) {
        System.out.println(output);
    }
}
