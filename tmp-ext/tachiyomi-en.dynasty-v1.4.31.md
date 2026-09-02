# Extension Validation Report

- Extension: tachiyomi-en.dynasty-v1.4.31
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 26
- Lint: 2
- Warnings: 2
- Skipped: 6
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 669095474988166464
- Source name: Dynasty Scans
- Source language: en
- Selected manga input: popular offset 0: My Wish Is to Fall in Love Until You Die Official Comic Anthology (`.../my_wish_is_to_fall_in_love_until_you_die_official_comic_anthology`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 30 | My Wish Is to Fall in Love Until You Die Official Comic Anthology (`.../my_wish_is_to_fall_in_love_until_you_die_official_comic_anthology`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 30 | Love Me Tender at Midnight (`.../love_me_tender_at_midnight`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 8 | My Wish Is to Fall in Love Until You Die Official Comic Anthology (`.../my_wish_is_to_fall_in_love_until_you_die_official_comic_anthology`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | My Wish Is to Fall in Love Until You Die Official Comic Anthology (`.../my_wish_is_to_fall_in_love_until_you_die_official_comic_anthology`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 6 | Covers, Illustrations, and Authors' Comments by  (`.../covers_illustrations_and_authors_comments`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 11 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=My Wish Is to Fall in Love Until You Die Official Comic Anthology, URL=`.../my_wish_is_to_fall_in_love_until_you_die_official_comic_anthology` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | UNUSUAL | Overlapping manga: title=Oneshots, URL=`.../oneshots` at page 1 offset 4 and page 2 offset 2, title=Sakura's World, URL=`.../sakuras_world` at page 1 offset 8 and page 2 offset 25, title=Turn the Tables Yuri H Anthology, URL=`.../turn_the_tables_yuri_h_anthology` at page 1 offset 9 and page 2 offset 8, title=Original, URL=`.../original` at page 1 offset 13 and page 2 offset 3, title=Would You Cry If I Died?, URL=`.../would_you_cry_if_i_died` at page 1 offset 17 and page 2 offset 6, title=Pixiv, URL=`.../pixiv` at page 1 offset 18 and page 2 offset 4 |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 68/68 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | UNUSUAL | 46/68 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | SKIP | No thumbnail URL to load |  |  |  |
| details identity | PASS | Details preserved selected URL `.../my_wish_is_to_fall_in_love_until_you_die_official_comic_anthology` |  |  |  |
| details thumbnail URL | PASS | `https://dynasty-scans.com/.../4effccbc-c69e-48bf-9436-ef4b222b548d.png` |  |  |  |
| details author | PASS | Takeshima Eku, Yukiko, Miyahara Miyako, Itou Hachi, Utatane Yuu |  |  |  |
| details artist | PASS | Takeshima Eku, Yukiko, Miyahara Miyako, Itou Hachi, Utatane Yuu |  |  |  |
| details genres | PASS | Yuri, Official, Blushing, Smoking, Food, Amnesia |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | The first official comic anthology, presenting the "story of wishes" by 13 talented artists.<br><br>Cover Illustration: Honda Loalo<br><br>Illustrations: Mele, Minahamu<br><br>Type: Anthology<br><br>Doujin:<br>• My Wish Is To Fall In Love Until You Die<br><br>Pairing:<br>• Mimi x Sheena<br>• Ali x Seiran<br>• Fran x Omi<br><br>Aliases:<br>• KimiShinu Anthology |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 6 name |  |  |  |
| chapters | PASS | 6 chapters |  |  |  |
| chapter dates | PASS | 6 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 11 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://dynasty-scans.com/.../01.webp` (image/webp (encoding: lossy), 225788 bytes, 1441x2048) |  |  |  |
