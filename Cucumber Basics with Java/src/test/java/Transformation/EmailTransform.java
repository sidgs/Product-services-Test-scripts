package Transformation;

import cucumber.api.Transformer;

/**
 * Created by vens on 3/13/2017.
 */
public class EmailTransform extends Transformer<String> {

    @Override
    public String transform(String userName) {
        return userName.concat("@ea.com");
    }
}
