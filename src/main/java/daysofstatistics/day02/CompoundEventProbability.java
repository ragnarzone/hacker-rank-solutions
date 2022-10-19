package daysofstatistics.day02;

public class CompoundEventProbability {
    // X gives red: 4/7;
    // Y gives red: 5/9;
    // Z gives red: 4/8;

    // X gives black: 3/7;
    // Y gives black: 4/9;
    // Z gives black: 4/8;

    // P(2red, 1black) = P(red, red, black) + P(red, black, red) + P(black, red, red)
    // = (4/7)*(5/9)(4/8) + (4/7)*(4/9)*(4/8) + (3/7)*(5/9)*(4/8)
    // = 17/42
}
