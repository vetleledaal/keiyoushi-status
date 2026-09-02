# Extension Validation Report

- Extension: tachiyomi-all.luscious-v1.4.32
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 34
- Lint: 2
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.a
- Source ID: 2774395484485436593
- Source name: Luscious
- Source language: en
- Selected manga input: popular offset 0: Creampies💦Hentai (`.../creampieshentai_341758`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 27 | Creampies💦Hentai (`.../creampieshentai_341758`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 25 | The Monstergirl Bestiary (`.../the-monstergirl-bestiary_403876`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 30 | Just the best 2 (`.../just-the-best-2_614500`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 29 | Mikoto Uchiha - Naruto (`.../mikoto-uchiha-naruto_622577`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 30 | Creampies💦Hentai (`.../creampieshentai_341758`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Creampies💦Hentai (`.../creampieshentai_341758`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 996 | 1 - Bnha 89 01Cw9Z65Fzm409B0K1Kq5Y1Hpc1680X0 01Cze38E0Z6Jemz7G13022Pxsc.1680X0 (`.../bnha-89_01cw9z65fzm409b0k1kq5y1hpc1680x0_01cze38e0z_01DAMRQ6K09NYGE3CXAVTQJ2SC.1680x0.jpg`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 1 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 27 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Creampies💦Hentai, URL=`.../creampieshentai_341758` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 141/141 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 141/141 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://ah-img.luscious.net/.../defeadc4f2d7f94d37bd_01GNA8Q1HAJWFEQAM3ZBCH0KWA.640x0.jpg` (image/jpeg, 76171 bytes, 640x710) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../creampieshentai_341758` |  |  |  |
| details thumbnail URL | PASS | `https://ah-img.luscious.net/.../defeadc4f2d7f94d37bd_01GNA8Q1HAJWFEQAM3ZBCH0KWA.640x0.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Other, hot, Fetish, Straight Sex, creampie, Hentai |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Girls getting creampie<br><br>Pictures: 3124<br>Animated Pictures: 21 |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 1 name, chapter 11 name, chapter 12 name, chapter 13 name, chapter 14 name, chapter 15 name, chapter 16 name, chapter 17 name, chapter 18 name, chapter 19 name, chapter 20 name, chapter 21 name, chapter 22 name, chapter 23 name, chapter 24 name, chapter 25 name, chapter 26 name, chapter 27 name, chapter 28 name, chapter 34 name, chapter 35 name, chapter 36 name, chapter 37 name, chapter 38 name, chapter 39 name, chapter 40 name, chapter 41 name, chapter 42 name, chapter 43 name, chapter 44 name, chapter 45 name, chapter 46 name, chapter 52 name, chapter 53 name, chapter 54 name, chapter 55 name, chapter 56 name, chapter 57 name, chapter 58 name, chapter 59 name, chapter 60 name, chapter 61 name, chapter 62 name, chapter 63 name, chapter 64 name, chapter 65 name, chapter 66 name, chapter 67 name, chapter 68 name, chapter 69 name, chapter 70 name, chapter 71 name, chapter 72 name, chapter 73 name, chapter 74 name, chapter 75 name, chapter 76 name, chapter 77 name, chapter 78 name, chapter 79 name, chapter 80 name, chapter 81 name, chapter 82 name, chapter 83 name, chapter 84 name, chapter 85 name, chapter 86 name, chapter 87 name, chapter 88 name, chapter 89 name, chapter 90 name, chapter 91 name, chapter 92 name, chapter 93 name, chapter 94 name, chapter 95 name, chapter 96 name, chapter 97 name, chapter 98 name, chapter 99 name, chapter 100 name, chapter 101 name, chapter 102 name, chapter 103 name, chapter 104 name, chapter 105 name, chapter 106 name, chapter 107 name, chapter 110 name, chapter 111 name, chapter 118 name, chapter 119 name, chapter 120 name, chapter 121 name, chapter 122 name, chapter 123 name, chapter 124 name, chapter 125 name, chapter 126 name, chapter 127 name, chapter 128 name, chapter 133 name, chapter 134 name, chapter 135 name, chapter 136 name, chapter 137 name, chapter 138 name, chapter 139 name, chapter 140 name, chapter 141 name, chapter 142 name, chapter 143 name, chapter 144 name, chapter 145 name, chapter 146 name, chapter 147 name, chapter 148 name, chapter 149 name, chapter 150 name, chapter 151 name, chapter 152 name, chapter 153 name, chapter 154 name, chapter 155 name, chapter 156 name, chapter 157 name, chapter 158 name, chapter 165 name, chapter 166 name, chapter 167 name, chapter 168 name, chapter 169 name, chapter 170 name, chapter 171 name, chapter 172 name, chapter 195 name, chapter 196 name, chapter 197 name, chapter 198 name, chapter 199 name, chapter 200 name, chapter 201 name, chapter 202 name, chapter 203 name, chapter 204 name, chapter 205 name, chapter 206 name, chapter 207 name, chapter 208 name, chapter 209 name, chapter 210 name, chapter 211 name, chapter 212 name, chapter 213 name, chapter 214 name, chapter 215 name, chapter 216 name, chapter 217 name, chapter 218 name, chapter 257 name, chapter 258 name, chapter 259 name, chapter 260 name, chapter 261 name, chapter 262 name, chapter 263 name, chapter 264 name, chapter 265 name, chapter 266 name, chapter 267 name, chapter 268 name, chapter 269 name, chapter 270 name, chapter 271 name, chapter 272 name, chapter 273 name, chapter 274 name, chapter 275 name, chapter 276 name, chapter 277 name, chapter 278 name, chapter 279 name, chapter 280 name, chapter 281 name, chapter 282 name, chapter 331 name, chapter 332 name, chapter 333 name, chapter 334 name, chapter 335 name, chapter 336 name, chapter 337 name, chapter 338 name, chapter 339 name, chapter 340 name, chapter 341 name, chapter 342 name, chapter 343 name, chapter 344 name, chapter 345 name, chapter 346 name, chapter 347 name, chapter 348 name, chapter 349 name, chapter 350 name, chapter 351 name, chapter 352 name, chapter 353 name, chapter 354 name, chapter 355 name, chapter 356 name, chapter 357 name, chapter 358 name, chapter 359 name, chapter 360 name, chapter 361 name, chapter 362 name, chapter 363 name, chapter 364 name, chapter 365 name, chapter 366 name, chapter 367 name, chapter 368 name, chapter 369 name, chapter 370 name, chapter 371 name, chapter 372 name, chapter 373 name, chapter 374 name, chapter 377 name, chapter 378 name, chapter 379 name, chapter 380 name, chapter 386 name, chapter 387 name, chapter 388 name, chapter 389 name, chapter 390 name, chapter 391 name, chapter 392 name, chapter 393 name, chapter 394 name, chapter 395 name, chapter 396 name, chapter 397 name, chapter 398 name, chapter 399 name, chapter 400 name, chapter 416 name, chapter 417 name, chapter 418 name, chapter 419 name, chapter 420 name, chapter 421 name, chapter 422 name, chapter 423 name, chapter 425 name, chapter 426 name, chapter 427 name, chapter 428 name, chapter 429 name, chapter 430 name, chapter 431 name, chapter 432 name, chapter 433 name, chapter 434 name, chapter 435 name, chapter 437 name, chapter 438 name, chapter 439 name, chapter 450 name, chapter 451 name, chapter 452 name, chapter 453 name, chapter 454 name, chapter 455 name, chapter 456 name, chapter 457 name, chapter 458 name, chapter 459 name, chapter 460 name, chapter 461 name, chapter 462 name, chapter 464 name, chapter 465 name, chapter 488 name, chapter 489 name, chapter 490 name, chapter 503 name, chapter 504 name, chapter 505 name, chapter 506 name, chapter 507 name, chapter 508 name, chapter 509 name, chapter 510 name, chapter 511 name, chapter 512 name, chapter 513 name, chapter 514 name, chapter 515 name, chapter 516 name, chapter 517 name, chapter 518 name, chapter 519 name, chapter 520 name, chapter 521 name, chapter 522 name, chapter 523 name, chapter 524 name, chapter 525 name, chapter 526 name, chapter 527 name, chapter 528 name, chapter 529 name, chapter 530 name, chapter 531 name, chapter 532 name, chapter 533 name, chapter 534 name, chapter 535 name, chapter 536 name, chapter 537 name, chapter 538 name, chapter 539 name, chapter 540 name, chapter 541 name, chapter 542 name, chapter 543 name, chapter 544 name, chapter 545 name, chapter 546 name, chapter 547 name, chapter 548 name, chapter 549 name, chapter 550 name, chapter 551 name, chapter 552 name, chapter 553 name, chapter 557 name, chapter 558 name, chapter 559 name, chapter 560 name, chapter 561 name, chapter 562 name, chapter 563 name, chapter 564 name, chapter 565 name, chapter 566 name, chapter 567 name, chapter 568 name, chapter 569 name, chapter 570 name, chapter 571 name, chapter 572 name, chapter 573 name, chapter 574 name, chapter 575 name, chapter 576 name, chapter 577 name, chapter 578 name, chapter 579 name, chapter 580 name, chapter 581 name, chapter 582 name, chapter 583 name, chapter 584 name, chapter 585 name, chapter 586 name, chapter 587 name, chapter 588 name, chapter 589 name, chapter 590 name, chapter 591 name, chapter 592 name, chapter 593 name, chapter 594 name, chapter 595 name, chapter 596 name, chapter 601 name, chapter 602 name, chapter 603 name, chapter 604 name, chapter 605 name, chapter 606 name, chapter 607 name, chapter 608 name, chapter 609 name, chapter 610 name, chapter 611 name, chapter 612 name, chapter 613 name, chapter 614 name, chapter 615 name, chapter 616 name, chapter 617 name, chapter 618 name, chapter 619 name, chapter 620 name, chapter 621 name, chapter 622 name, chapter 623 name, chapter 624 name, chapter 625 name, chapter 626 name, chapter 627 name, chapter 628 name, chapter 629 name, chapter 630 name, chapter 631 name, chapter 632 name, chapter 633 name, chapter 634 name, chapter 635 name, chapter 636 name, chapter 637 name, chapter 638 name, chapter 639 name, chapter 640 name, chapter 641 name, chapter 642 name, chapter 643 name, chapter 644 name, chapter 645 name, chapter 646 name, chapter 647 name, chapter 648 name, chapter 649 name, chapter 650 name, chapter 651 name, chapter 652 name, chapter 653 name, chapter 654 name, chapter 655 name, chapter 656 name, chapter 657 name, chapter 658 name, chapter 659 name, chapter 660 name, chapter 661 name, chapter 662 name, chapter 663 name, chapter 664 name, chapter 665 name, chapter 666 name, chapter 667 name, chapter 668 name, chapter 669 name, chapter 670 name, chapter 671 name, chapter 672 name, chapter 673 name, chapter 710 name, chapter 711 name, chapter 712 name, chapter 713 name, chapter 754 name, chapter 757 name, chapter 758 name, chapter 759 name, chapter 760 name, chapter 761 name, chapter 762 name, chapter 793 name, chapter 794 name, chapter 795 name, chapter 796 name, chapter 797 name, chapter 798 name, chapter 799 name, chapter 800 name, chapter 801 name, chapter 802 name, chapter 803 name, chapter 804 name, chapter 805 name, chapter 806 name, chapter 807 name, chapter 808 name, chapter 809 name, chapter 810 name, chapter 812 name, chapter 813 name, chapter 814 name, chapter 815 name, chapter 816 name, chapter 817 name, chapter 827 name, chapter 829 name, chapter 830 name, chapter 831 name, chapter 834 name, chapter 836 name, chapter 858 name, chapter 861 name, chapter 867 name, chapter 872 name, chapter 875 name, chapter 876 name, chapter 878 name, chapter 893 name, chapter 895 name, chapter 899 name, chapter 905 name, chapter 911 name, chapter 912 name, chapter 926 name, chapter 935 name, chapter 936 name, chapter 937 name, chapter 938 name, chapter 939 name, chapter 940 name, chapter 941 name, chapter 942 name, chapter 950 name, chapter 955 name, chapter 984 name, chapter 990 name, chapter 995 name |  |  |  |
| chapters | PASS | 996 chapters |  |  |  |
| chapter dates | PASS | 996 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 1 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://ah-img.luscious.net/.../bnha-89_01cw9z65fzm409b0k1kq5y1hpc1680x0_01cze38e0z_01DAMRQ6K09NYGE3CXAVTQJ2SC.1680x0.jpg` (image/jpeg, 70127 bytes, 758x1020) |  |  |  |
