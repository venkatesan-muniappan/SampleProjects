package org.venkat.package1;


/* The Goal of Annotation is below 3 things.
1. Configuration
2. Label/Marking
3. Avoiding duplicate codes
 */

//import org.checkerframework.checker.nullness.qual.NonNull;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

@Data
@SuppressWarnings("unused")
public class DefaultAnnotations {

    private String name = "Kavitha";
    private int age = 10;
    private float conversionRate = 10.456f;

    @Deprecated
    public int getString(@NotNull String str) {
        System.out.println(str.toLowerCase());
        return 1;
    }

    @SuppressWarnings("unused")
    public void getStringV2(String key) {
        System.out.println("The key is " + key);
    }

    @SuppressWarnings("unused")
    public int compareTo() {
        return 1;
    }

}