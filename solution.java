public String catDog(String a, String b) {
	return !a.contains("dog") && !b.contains("dog") && !a.contains("cat") && !b.contains("cat") ? "" : !a.contains("dog") && !b.contains("dog") ? "dog" : !a.contains("cat") && !b.contains("cat") ? "cat" : a.contains("dog") && b.contains("dog") ? a.contains("cat") && b.contains("cat") ? a.indexOf("dog") < b.indexOf("dog") ? a.indexOf("cat") < b.indexOf("cat") ? a.indexOf("dog") < a.indexOf("cat") ? "dogcat" : a.indexOf("dog") == a.indexOf("cat") ? "" : "catdog" : a.indexOf("dog") < b.indexOf("cat") ? "dogcat" : a.indexOf("dog") == b.indexOf("cat") ? "" : "catdog" : a.indexOf("cat") < b.indexOf("cat") ? b.indexOf("dog") < a.indexOf("cat") ? "dogcat" : b.indexOf("dog") == a.indexOf("cat") ? "" : "catdog" : b.indexOf("dog") < b.indexOf("cat") ? "dogcat" : b.indexOf("dog") == b.indexOf("cat") ? "" : "catdog" : a.contains("cat") ? a.indexOf("dog") < b.indexOf("dog") ? a.indexOf("dog") < a.indexOf("cat") ? "dogcat" : a.indexOf("dog") == a.indexOf("cat") ? "" : "catdog" : b.indexOf("dog") < a.indexOf("cat") ? "dogcat" : b.indexOf("dog") == a.indexOf("cat") ? "" : "catdog" : a.indexOf("dog") < b.indexOf("dog") ? a.indexOf("dog") < b.indexOf("cat") ? "dogcat" : a.indexOf("dog") == b.indexOf("cat") ? "" : "catdog" : b.indexOf("dog") < b.indexOf("cat") ? "dogcat" : b.indexOf("dog") == b.indexOf("cat") ? "" : "catdog" : a.contains("dog") ? a.contains("cat") && b.contains("cat") ? a.indexOf("cat") < b.indexOf("cat") ? a.indexOf("dog") < a.indexOf("cat") ? "dogcat" : a.indexOf("dog") == a.indexOf("cat") ? "" : "catdog" : a.indexOf("dog") < b.indexOf("cat") ? "dogcat" : a.indexOf("dog") == b.indexOf("cat") ? "" : "catdog" : a.contains("cat") ? a.indexOf("dog") < a.indexOf("cat") ? "dogcat" : a.indexOf("dog") == a.indexOf("cat") ? "" : "catdog" : a.indexOf("dog") < b.indexOf("cat") ? "dogcat" : a.indexOf("dog") == b.indexOf("cat") ? "" : "catdog" : a.contains("cat") && b.contains("cat") ? a.indexOf("cat") < b.indexOf("cat") ? b.indexOf("dog") < a.indexOf("cat") ? "dogcat" : b.indexOf("dog") == a.indexOf("cat") ? "" : "catdog" : b.indexOf("dog") < b.indexOf("cat") ? "dogcat" : b.indexOf("dog") == b.indexOf("cat") ? "" : "catdog" : a.contains("cat") ? b.indexOf("dog") < a.indexOf("cat") ? "dogcat" : b.indexOf("dog") == a.indexOf("cat") ? "" : "catdog" : b.indexOf("dog") < b.indexOf("cat") ? "dogcat" : b.indexOf("dog") == b.indexOf("cat") ? "" : "catdog";
}

/*
public String catDog(String a, String b) {
	return !a.contains("dog") && !b.contains("dog") && !a.contains("cat") && !b.contains("cat") ? 
        "" 
    : !a.contains("dog") && !b.contains("dog") ? 
        "dog"
    : !a.contains("cat") && !b.contains("cat") ? 
        "cat" 
    : a.contains("dog") && b.contains("dog")? 
        a.contains("cat") && b.contains("cat") ? 
            a.indexOf("dog") < b.indexOf("dog") ? 
                a.indexOf("cat") < b.indexOf("cat") ? 
                    a.indexOf("dog") < a.indexOf("cat") ?
                        "dogcat"
                    : a.indexOf("dog") == a.indexOf("cat") ?
                        ""
                    :
                        "catdog"
                :
                    a.indexOf("dog") < b.indexOf("cat") ?
                        "dogcat"
                    : a.indexOf("dog") == b.indexOf("cat") ?
                        ""
                    :
                        "catdog"
            :
                a.indexOf("cat") < b.indexOf("cat") ?
                    b.indexOf("dog") < a.indexOf("cat") ?
                        "dogcat"
                    : b.indexOf("dog") == a.indexOf("cat") ?
                        ""
                    :
                        "catdog"
                :
                    b.indexOf("dog") < b.indexOf("cat") ?
                        "dogcat"
                    : b.indexOf("dog") == b.indexOf("cat") ?
                        ""
                    :
                        "catdog"
        :
            a.contains("cat") ?
                a.indexOf("dog") < b.indexOf("dog") ? 
                    a.indexOf("dog") < a.indexOf("cat") ?
                        "dogcat"
                    : a.indexOf("dog") == a.indexOf("cat") ?
                        ""
                    :
                        "catdog"
                :
                    b.indexOf("dog") < a.indexOf("cat") ?
                        "dogcat"
                    : b.indexOf("dog") == a.indexOf("cat") ?
                        ""
                    :
                        "catdog"
            :
                a.indexOf("dog") < b.indexOf("dog") ?
                    a.indexOf("dog") < b.indexOf("cat") ?
                        "dogcat"
                    : a.indexOf("dog") == b.indexOf("cat") ?
                        ""
                    :
                        "catdog"
                :
                    b.indexOf("dog") < b.indexOf("cat") ? 
                        "dogcat"
                    : b.indexOf("dog") == b.indexOf("cat") ?
                        ""
                    :
                        "catdog"
    : a.contains("dog") ?
        a.contains("cat") && b.contains("cat") ? 
            a.indexOf("cat") < b.indexOf("cat") ?
                a.indexOf("dog") < a.indexOf("cat") ?
                    "dogcat"
                : a.indexOf("dog") == a.indexOf("cat") ?
                    ""
                :
                    "catdog"
            :
                a.indexOf("dog") < b.indexOf("cat") ?
                    "dogcat"
                : a.indexOf("dog") == b.indexOf("cat") ?
                    ""
                :
                    "catdog"
        :
            a.contains("cat") ?
                a.indexOf("dog") < a.indexOf("cat") ?
                    "dogcat"
                : a.indexOf("dog") == a.indexOf("cat") ?
                    ""
                :
                    "catdog"
            :
                a.indexOf("dog") < b.indexOf("cat") ?
                    "dogcat"
                : a.indexOf("dog") == b.indexOf("cat") ?
                    ""
                :
                    "catdog"
    :
        a.contains("cat") && b.contains("cat") ? 
            a.indexOf("cat") < b.indexOf("cat") ?
                b.indexOf("dog") < a.indexOf("cat") ?
                    "dogcat"
                : b.indexOf("dog") == a.indexOf("cat") ?
                    ""
                :
                    "catdog"
            :
                b.indexOf("dog") < b.indexOf("cat") ?
                    "dogcat"
                : b.indexOf("dog") == b.indexOf("cat") ?
                    ""
                :
                    "catdog"
        :
            a.contains("cat") ?
                b.indexOf("dog") < a.indexOf("cat") ?
                    "dogcat"
                : b.indexOf("dog") == a.indexOf("cat") ?
                    ""
                :
                    "catdog"
            :
                b.indexOf("dog") < b.indexOf("cat") ?
                    "dogcat"
                : b.indexOf("dog") == b.indexOf("cat") ?
                    ""
                :
                    "catdog";
                        
}
*/
