package com.companyname.bank;

import org.semanticweb.yars.nx.Node;
import org.semanticweb.yars.nx.Resource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Resource subj = new Resource("<http://example.org/Subject>",true);
        Resource pred = new Resource("<http://example.org/Predicate>", true);
        Resource obj = new Resource("<http://example.org/Object>", true);
        Node[] triple = new Node[]{subj,pred,obj};
        System.out.printf("%s %s %s .", triple[0].toN3(), triple[1].toN3(), triple[2].toN3());
    }
}
