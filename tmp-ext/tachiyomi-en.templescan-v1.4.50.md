# Extension Validation Report

- Extension: tachiyomi-en.templescan-v1.4.50
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
- Source implementation: keiyoushi.source.Generated
- Source ID: 4210732525216763379
- Source name: Temple Scan
- Source language: en
- Selected manga input: latest offset 0: Cry Or Better Yet, Beg (`.../cry-or-better-yet-beg`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Tears on a Withered Flower (`.../tears-on-a-withered-flower`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 20 | In The Night, At The Duke's Mansion (`.../in-the-night-at-the-dukes-mansion`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 20 | Cry Or Better Yet, Beg (`.../cry-or-better-yet-beg`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | Predatory Marriage (Complete Edition) (`.../predatory-marriage-complete-edition`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Cry Or Better Yet, Beg (`.../cry-or-better-yet-beg`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Cry Or Better Yet, Beg (`.../cry-or-better-yet-beg`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 85 | Chapter 1 (`.../33678-chapter-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 19 |  |  | 1-10s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Cry Or Better Yet, Beg, URL=`.../cry-or-better-yet-beg` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://media.templetoons.com/.../fe6c6798-a2a2-4a67-921e-1618d3db0aec.webp` (image/webp (container: extended), 265702 bytes, 690x1000) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../cry-or-better-yet-beg` |  |  |  |
| details thumbnail URL | PASS | `https://media.templetoons.com/.../fe6c6798-a2a2-4a67-921e-1618d3db0aec.webp` |  |  |  |
| details author | LINT | Author is empty; use null when unknown |  |  |  |
| details artist | PASS | Naver |  |  |  |
| details genres | PASS | Manhwa, 2023 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Orphaned at a young age, Layla Llewellyn feels like the luckiest girl in the world after she moves in with her uncle Bill, a gardener who lives on the scenic Arvis estate in the Berg Empire. To Layla, Arvis seems like paradise; she loves to explore the vast forest, always bringing her notebook to record the wildlife she encounters. She especially loves the birds, watching them with awe as they hatch and grow from fluffy chicks into beautiful birds. Duke Herhardt, the young, handsome lord of Arvis, is also interested in birds—and in Layla. But the difference is, he’s interested in birds because he likes to hunt them… And he’s interested in Layla because he likes to make her cry. If a lovely bird is trapped in a golden cage, which will she choose: a life of luxury or freedom? WARNING: This story contains depictions of abuse, the trauma of children, substance abuse, and sexual assault that may be upsetting to some readers.<br><br>Alternative Name: 울어 봐, 빌어도 좋고<br> |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 85 chapters |  |  |  |
| chapter dates | PASS | 85 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 19 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://imagizer.imageshack.com/.../qIV4XD.jpg` (image/jpeg, 371399 bytes, 638x8000) |  |  |  |
