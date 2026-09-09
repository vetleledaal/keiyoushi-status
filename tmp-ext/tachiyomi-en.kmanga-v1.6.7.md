# Extension Validation Report

- Extension: tachiyomi-en.kmanga-v1.6.7
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 33
- Lint: 1
- Warnings: 1
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8143442163119480220
- Source name: K Manga
- Source language: en
- Selected manga input: latest offset 0: The Exiled Heavy Knight Knows How to Game the System (`.../10577`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Shangri-La Frontier (`.../10011`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 25 | A Couple of Cuckoos (`.../10003`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 12 | The Exiled Heavy Knight Knows How to Game the System (`.../10577`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | The Exiled Heavy Knight Knows How to Game the System (`.../10577`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | The Exiled Heavy Knight Knows How to Game the System (`.../10577`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 178 | Chapter 1 (`.../352736`) |  | <1s |
| pages | `getPageList(chapter)` | success | 38 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 12 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Exiled Heavy Knight Knows How to Game the System, URL=`.../10577` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 63/63 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 63/63 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.kmanga.kodansha.com/.../title_grid_square_202407051408094f05e0e9dd77b6ec6ac31e7878d41e2a.png` (image/png, 56767 bytes, 320x320) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../10577` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn.kmanga.kodansha.com/.../banner_20240705140809f9ec41c26636483d4199b78b81f61036.png` (image/png, 133171 bytes, 640x368) |  |  |  |
| details author | PASS | Story by Nekoko Manga by BroccoLee Character Design by Jaian |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Isekai･Super Powers, Anime |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | The Exiled Heavy Knight Knows How to Game the System is the hottest isekai story, pulling in the top number of views from the popular “shousetsuka ni narou“ isekai story website (as of January 1, 2022). “You useless son of mine! You were supposed to pull master swordsman, but I never thought it would be this tragic!“ The day a child turns fifteen, they undergo the Ritual of Divine Blessing. Already descended from a line of master swordsman, Elymas was supposed to succeed his father. However, he pulls the defective class, the Heavy Knight, and not only loses his status as future head of the household, but he's also exiled. With their unbalanced stats and seemingly useless skills, Heavy Knights are spoked of as a class for cowards and the lazy. However, Elymas knows the truth. The world he lives in is the same as the one of the game he used to play... It is the Heavy Knight that is the most powerful class of them all. Using memories from his past life, Elymas has set out to effectively conquer this entire world. " Translation by Minna Lin, Joshua Hardy, Lettering by Carla Gil Caba, Monika Hegedusova, KPS Products Corp..../YKS Services LLC/SKY JAPAN, Inc.<br><br>Japanese Title: 追放された転生重騎士はゲーム知識で無双する |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 178 chapters |  |  |  |
| chapter dates | PASS | 178 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 38 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.kmanga.kodansha.com/.../c90cb7b096eebf3830c4afc44439868188e83ff33e745711f048f77ef3cac622.jpg <redacted query values: Expires, Signature, and Key-Pair-Id>` (image/jpeg, 338158 bytes, 960x1378) |  |  |  |
