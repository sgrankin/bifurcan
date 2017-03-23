load "common.gnu"

data = "../data/map_difference_overlap.csv"
set output dir."map_difference_overlap".ext
set title "map overlapping differences"

plot data using 1:2, for [i=3:21] '' using 1:i