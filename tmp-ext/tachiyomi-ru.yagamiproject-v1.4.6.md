# Extension Validation Report

- Extension: tachiyomi-ru.yagamiproject-v1.4.6
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 33
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5458965504724393093
- Source name: YagamiProject
- Source language: ru
- Selected manga input: latest offset 0: Up Up Balloon (`.../up_up_balloon`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 30 | Up Up Balloon (`.../up_up_balloon`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 30 | Ping Kong (`.../ping_kong`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 5 | Up Up Balloon (`.../up_up_balloon`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 19 | Tower of God (`.../tower_of_god`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Up Up Balloon (`.../up_up_balloon`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Up Up Balloon (`.../up_up_balloon`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 1 | Том 1. Глава 1 (`.../1`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 9 |  |  | 1-10s |

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
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 5 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Up Up Balloon, URL=`.../up_up_balloon` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=Goodbye Dragon Life, Hello Human Life, URL=`.../goodbye_dragon_life_hello_human_life` at page 1 offset 1 and page 2 offsets 1, 6, title=Tower of God, URL=`.../tower_of_god` at page 1 offsets 2, 4 and page 2 offsets 0, 2, 5, 7, 10, 12, 14, 16, 18, title=Team Medical Dragon, URL=`.../team_medical_dragon` at page 1 offset 3 and page 2 offset 4 |  |  |  |
| listing duplicates | FAIL | Latest page 1 repeats 1 manga entry: title=Tower of God, URL=`.../tower_of_god`; Latest page 2 repeats 13 manga entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| manga title and URL | PASS | 85/85 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 85/85 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://read.yagami.me/.../000000.png` (image/png, 145047 bytes, 250x352) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../up_up_balloon` |  |  |  |
| details thumbnail URL | PASS | `https://read.yagami.me/.../000000.png` |  |  |  |
| details author | PASS | Monkey Punch |  |  |  |
| details artist | PASS | Monkey Punch |  |  |  |
| details genres | PASS | комедия, повседневность, сейнен |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Ввысь, ввысь, шарик<br>Альтернативные названия:<br><br> Ввысь, ввысь, шарик<br>  / <br> Up Up Balloon<br>  / <br> Up Up バルーン<br><br>Комедийные зарисовки аэронафта от Манки Панча. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | LINT | Page indices are 1-indexed, but should be 0-indexed |  |  |  |
| page URLs | PASS | 9 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://read.yagami.me/.../000.png` (image/png, 4712300 bytes, 2048x2982) |  |  |  |
