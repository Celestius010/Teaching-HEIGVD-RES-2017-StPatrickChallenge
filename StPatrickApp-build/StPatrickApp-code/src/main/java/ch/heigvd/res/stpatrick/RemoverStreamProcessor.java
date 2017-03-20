package ch.heigvd.res.stpatrick;

import java.io.*;

/**
 * Created by celestius on 20.03.17.
 */
public class RemoverStreamProcessor implements IStreamProcessor {

    private char c;

    public RemoverStreamProcessor(char c){
        this.c = c;
    }

    @Override
    public void process(Reader in, Writer out) throws IOException {
        BufferedReader br = new BufferedReader(in);
        BufferedWriter bw = new BufferedWriter(out);

        int c ;

        while ((c = br.read()) != -1) {
            if(c!=this.c&&c!=Character.toUpperCase(this.c))
                bw.write(c);
        }

        bw.flush();
    }
}
