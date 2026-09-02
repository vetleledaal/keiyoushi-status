# Extension Validation Report

- Extension: tachiyomi-en.timelesstoons-v1.6.22
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 30
- Lint: 1
- Warnings: 1
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 9063123408669132087
- Source name: TimelessToons
- Source language: en
- Selected manga input: popular offset 0: The Regressed Sword Saint’s Theory of Magic (`.../the-regressed-sword-saints-theory-of-magic`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 6 | The Regressed Sword Saint’s Theory of Magic (`.../the-regressed-sword-saints-theory-of-magic`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 168 | What if the strongest final boss in the original becomes a companion of the main character? (`.../what-if-the-strongest-final-boss-in-the-original-becomes-a-companion-of-the-main-character`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | The Regressed Sword Saint’s Theory of Magic (`.../the-regressed-sword-saints-theory-of-magic`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | The Regressed Sword Saint’s Theory of Magic (`.../the-regressed-sword-saints-theory-of-magic`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 36 | Chapter 1 (`.../64892d9c8ea-64894618904`) |  | <1s |
| pages | `getPageList(chapter)` | success | 26 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 6 entries |  |  |  |
| latest listing | PASS | 168 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Regressed Sword Saint’s Theory of Magic, URL=`.../the-regressed-sword-saints-theory-of-magic` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 175/175 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 175/175 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://wsrv.nl <redacted query values: url and w>` (image/jpeg, 56580 bytes, 480x534) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../the-regressed-sword-saints-theory-of-magic` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://wsrv.nl <redacted query values: url and w>` (image/jpeg, 76902 bytes, 480x640) |  |  |  |
| details author | PASS | TOTSU Akita |  |  |  |
| details artist | PASS | SORAJIMA |  |  |  |
| details genres | PASS | Mangatoon, adventure, drama, fantasy, shounen |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | All who stand against monsters are eventually forced to make a choice. One path is that of the mage, wielding magic capable of creating supernatural miracles. The other is the path of the swordsman, mastering inhuman techniques through sheer skill. Oscar, a swordsman, had swung a blade since early childhood and rose to the rank of the highest Sword Saint. He cut down ferocious monsters, earned the admiration of the people, and lived a life envied by all. Yet deep within his heart, he harbored a secret longing— an unfulfilled admiration for the path of the mage…?<br><br>Alternative Titles:<br>- The Magic Theory of the Regressed Sword Saint<br>- 回帰した剣聖の魔法理論 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 36 chapters |  |  |  |
| chapter dates | LINT | 1 of 36 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 26 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn.meowing.org/.../gRWrlnXSZ8G` (image/png, 519381 bytes, 800x496; server Content-Type: text/plain) |  |  |  |
