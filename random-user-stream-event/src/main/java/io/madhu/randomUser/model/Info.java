/**
 * Author: Madhu
 * User:madhu
 * Date:23/6/24
 * Time:8:48 AM
 * Project: random-user-stream-event
 */

package io.madhu.randomUser.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Info {
    public String seed;
    public int results;
    public int page;
    public String version;
}
