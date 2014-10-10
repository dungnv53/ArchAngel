#!/usr/bin/perl

undef $/;
$_ = <>;
$n = 0;

for $match (split(/(?=3d3d)/)) {
      open(O, '>temp' . ++$n);
	print O $match;
        close(O);
   }


