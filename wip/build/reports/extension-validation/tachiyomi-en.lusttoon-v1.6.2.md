# Extension Validation Report

- Extension: tachiyomi-en.lusttoon-v1.6.2
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5466172882050312169
- Source name: LustToon
- Source language: en
- Selected manga input: popular offset 0: Wild Dogs Dream of Predation (`.../wild-dogs-dream-of-predation`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Wild Dogs Dream of Predation (`.../wild-dogs-dream-of-predation`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 24 | Broken and Abandoned (`.../broken-and-abandoned`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | Love Comes In The Night Of The Moon (`.../love-comes-in-the-night-of-the-moon`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Moral Panic (`.../moral-panic`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Wild Dogs Dream of Predation (`.../wild-dogs-dream-of-predation`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Wild Dogs Dream of Predation (`.../wild-dogs-dream-of-predation`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 38 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 11 |  |  | <1s |

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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Wild Dogs Dream of Predation, URL=`.../wild-dogs-dream-of-predation` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=Hong-Cha and Beom-ja., URL=`.../hong-cha-and-beom-ja` at page 1 offset 1 and page 2 offset 23, title=Moral Panic, URL=`.../moral-panic` at page 1 offset 2 and page 2 offset 0, title=Merry Guide to a Bad Ending, URL=`.../merry-guide-to-a-bad-ending` at page 1 offset 3 and page 2 offset 1, title=The Coral Crown, URL=`.../the-coral-crown` at page 1 offset 4 and page 2 offset 2, title=Love:Zero, URL=`.../lovezero` at page 1 offset 5 and page 2 offset 3, title=Even If You Run Away, My Love, URL=`.../even-if-you-run-away-my-love` at page 1 offset 6 and page 2 offset 4, title=Plase Forget me, URL=`.../plase-forget-me` at page 1 offset 7 and page 2 offset 5, title=One-Way Mind Link, URL=`.../one-way-mind-link` at page 1 offset 8 and page 2 offset 6, title=Affordable Romance, URL=`.../affordable-romance` at page 1 offset 9 and page 2 offset 7, title=My Husband Didn't Want A Pregnancy, URL=`.../my-husband-didnt-want-a-pregnancy` at page 1 offset 10 and page 2 offset 8, title=The Legitimate Wife, URL=`.../the-legitimate-wife` at page 1 offset 11 and page 2 offset 9, title=Survival Instinct, URL=`.../survival-instinct` at page 1 offset 12 and page 2 offset 10, title=The Pregnancy Trap, URL=`.../the-pregnancy-trap` at page 1 offset 13 and page 2 offset 11, title=I Grabbed The Arrrogant Dogs Leash , URL=`.../i-grabbed-the-arrrogant-dogs-leash` at page 1 offset 14 and page 2 offset 12, title=Becoming An Orchid, URL=`.../becoming-an-orchid` at page 1 offset 15 and page 2 offset 13, title=My Beautiful Brother-in-Law, URL=`.../my-beautiful-brother-in-law` at page 1 offset 16 and page 2 offset 14, title=The Priestess of Dahalen, URL=`.../the-priestess-of-dahalen` at page 1 offset 17 and page 2 offset 15, title=The Succubus Who Wanted a Normal Life!, URL=`.../the-succubus-who-wanted-a-normal-life` at page 1 offset 18 and page 2 offset 16, title=Untitled, URL=`.../untitled` at page 1 offset 19 and page 2 offset 17 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 93/93 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 93/93 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://media.lustoon.com/.../6c0ed887-447e-4199-97e3-dbe3012d33e0.jpg` (image/jpeg, 321432 bytes, 960x1380) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../wild-dogs-dream-of-predation` |  |  |  |
| details thumbnail URL | PASS | `https://media.lustoon.com/.../6c0ed887-447e-4199-97e3-dbe3012d33e0.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Accion, Crimen, Romance, Smut |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Mido is kidnapped to serve as a blood source for a young master with a rare constitution. She prepares herself for a miserable end, believing she’ll be abused to death—but the man she meets is beautiful, gentle, and seemingly harmless.<br><br>While staying by Baekgyeong’s side and waiting for a chance to escape, Mido finds her defenses gradually crumbling before a man who hides behind a kind façade.<br>Sensing danger in herself for allowing someone she should hate, she pushes him away.<br><br>A tense battle unfolds between one who tries to hold on and one who tries to escape. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 38 chapters |  |  |  |
| chapter dates | PASS | 38 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 11 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://media.lustoon.com/.../0.01.jpg` (image/jpeg, 1178934 bytes, 2400x1600) |  |  |  |
