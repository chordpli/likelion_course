package week3.day5.com.likelion.context;

import java.util.List;

public interface Parser<T> {
    List<T> parse(String str);
}
