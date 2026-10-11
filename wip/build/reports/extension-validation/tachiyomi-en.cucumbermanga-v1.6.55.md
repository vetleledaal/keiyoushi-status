# Extension Validation Report

- Extension: tachiyomi-en.cucumbermanga-v1.6.55
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
- Source theme: madara
- Source ID: 3890119680043332770
- Source name: Cucumber Manga
- Source language: en
- Selected manga input: popular offset 0: Blossoms of The White Night [Cucumbermanga] (`.../3719`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Blossoms of The White Night [Cucumbermanga] (`.../3719`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | Swallow You Whole (`.../2403`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 25 | DESIRE ME IF YOU CAN (`.../3943`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Rut Partner (`.../5426`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Blossoms of The White Night [Cucumbermanga] (`.../3719`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Blossoms of The White Night [Cucumbermanga] (`.../3719`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 95 | 0 (`.../n-a`) |  | <1s |
| pages | `getPageList(chapter)` | success | 1 |  |  | <1s |

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
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Blossoms of The White Night \[Cucumbermanga\], URL=`3719` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cucumbermanga.com/.../gen-n-z7839583941863_9fd59e0a07de58567eb43eb6279a02b9-175x238.jpg` (image/jpeg, 12717 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `3719` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cucumbermanga.com/.../gen-n-z7839583941863_9fd59e0a07de58567eb43eb6279a02b9-193x278.jpg` (image/jpeg, 16301 bytes, 193x278) |  |  |  |
| details author | PASS | Brothers without a tomorrow, Brothers Without a Tomorrow(Story&Art) |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Adult, BL, Manhwa, Romance, Smut, Yaoi, Age Gap, Drama, Full Color, Historical, Mature, Mystery, Royal family, Royalty, Webtoon, Yaoi(BL) |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Summary: To secure an alliance between the northern kingdom of Leracal and the southern realm of Arnata, the countries’ royal families agree to a political marriage. Tei, known across the frozen battlefields as the most fearsome warrior and monster hunter, volunteers himself as the kingdom’s hostage, trading his life as a warrior for that of a bride. In Arnata, Tei finds not the hostility he anticipated but the calm, steady gaze of Shuraka, the young crown prince destined to become both his spouse and future Padisha of the empire. For Shuraka to claim the throne, however, he must survive an uprising that threatens the kingdom – once that forces him to draw the blood of his own brothers. Moved by the courage and gentle integrity of his betrothed, Tei pledges to protect him at any cost…and in the quiet hours of a white night, two hearts caught between loyalty and longing begin to bloom.<br><br>Alternative Names: 백야의 꽃길 / ازهار الليل الابيض.../Bl%C3%BCten der weißen Nacht / La ventura del caballero blanco / Le Chemin Fleuri de la Nuit Blanche / บุปผาใต้คืนตะวันฉาย .../Hoa nở rộ giữa đêm trắng/ 白夜の花道 / 白夜的花路 / 백야의 꽃길 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 95 chapters |  |  |  |
| chapter dates | PASS | 95 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 1 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cucumbermanga.com/.../000.jpg` (image/jpeg, 107858 bytes, 690x1174) |  |  |  |
