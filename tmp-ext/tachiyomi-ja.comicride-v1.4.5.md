# Extension Validation Report

- Extension: tachiyomi-ja.comicride-v1.4.5
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 32
- Lint: 0
- Warnings: 1
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: comiciviewer
- Source ID: 6786869574657969795
- Source name: Comic Ride
- Source language: ja
- Selected manga input: popular offset 0: 無能は不要と言われ『時計使い』の僕は職人ギルドから追い出されるも、ダンジョンの深部で真の力に覚醒する (`.../e7e644612dc9e`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 32 | 無能は不要と言われ『時計使い』の僕は職人ギルドから追い出されるも、ダンジョンの深部で真の力に覚醒する (`.../e7e644612dc9e`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 14 | 呪われ侯爵様の訳ありメイド (`.../24a2c5eb2d433`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 無能は不要と言われ『時計使い』の僕は職人ギルドから追い出されるも、ダンジョンの深部で真の力に覚醒する (`.../e7e644612dc9e`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | 無能は不要と言われ『時計使い』の僕は職人ギルドから追い出されるも、ダンジョンの深部で真の力に覚醒する (`.../e7e644612dc9e`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 80 | 第1話 (`.../646f925f68063`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 52 |  |  | 1-10s |

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
| popular listing | PASS | 32 entries |  |  |  |
| latest listing | PASS | 14 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=無能は不要と言われ『時計使い』の僕は職人ギルドから追い出されるも、ダンジョンの深部で真の力に覚醒する, URL=`.../e7e644612dc9e` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 47/47 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 47/47 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-public.comici.jp/.../20231024175644881AFBCD225CDDC77B9A838BB1C5AEB1335-lg.webp` (image/webp (encoding: lossy), 43216 bytes, 720x378; server Content-Type: application/octet-stream) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../e7e644612dc9e` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn-public.comici.jp/.../20231024175644881AFBCD225CDDC77B9A838BB1C5AEB1335.png` (image/png, 1339890 bytes, 1280x672) |  |  |  |
| details author | PASS | さらさみさ, 桜霧琥珀, 福きつね |  |  |  |
| details artist | PASS | さらさみさ, 桜霧琥珀, 福きつね |  |  |  |
| details genres | PASS | コミックライド, バトル・アクション, 異世界・転生 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | スキル至上主義の世界で、「時計使い」という無能スキルを授かったシクロ。<br>人々にさげすまれるシクロはある日、強姦の罪を着せられ辺境送りになり、さらにダンジョン深層に続く穴へと突き落とされる。<br>絶体絶命の最深部で、シクロは「時計使いの能力で腹時計も止められたらいいのに」と考えた。すると空腹感が止まる。<br>それをきっかけにスキル「時計使い」が覚醒。やがて彼は能力を駆使し、SSS級冒険者として認められてゆく——。 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 80 chapters |  |  |  |
| chapter dates | PASS | 80 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 52 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://viewer.comicride.jp/.../master-1697469433128-01.jpg <redacted query values: Expires, Signature, and Key-Pair-Id> 8, 12, 15, 14, 4, 0, 3, 5, 11, 13, 1, 9, 7, 10, 6\]` (image/jpeg, 1044469 bytes, 1350x1920) |  |  |  |
