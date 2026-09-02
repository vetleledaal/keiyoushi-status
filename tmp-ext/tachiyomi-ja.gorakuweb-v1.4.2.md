# Extension Validation Report

- Extension: tachiyomi-ja.gorakuweb-v1.4.2
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 29
- Lint: 3
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8261703368756535165
- Source name: Goraku Web
- Source language: ja
- Selected manga input: latest offset 0: 撲殺ピンク～性犯罪者処刑人～ (`.../4286260776059849604`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 10 | 奴隷先生 (`.../8673371806278653610`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 17 | 撲殺ピンク～性犯罪者処刑人～ (`.../4286260776059849604`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 撲殺ピンク～性犯罪者処刑人～ (`.../4286260776059849604`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | 撲殺ピンク～性犯罪者処刑人～ (`.../4286260776059849604`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 288 | 第1話 ルーズソックス① - ① (`.../6069914714483902659`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 30 |  |  | 1-10s |

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
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 17 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=撲殺ピンク～性犯罪者処刑人～, URL=`4286260776059849604` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 28/28 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 28/28 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://gorakuweb-asset.akamaized.net/.../1881216076554062585.webp` (image/webp (container: extended), 34002 bytes, 460x282) |  |  |  |
| details identity | PASS | Details preserved selected URL `4286260776059849604` |  |  |  |
| details thumbnail URL | PASS | `https://gorakuweb-asset.akamaized.net/.../1881216076554062585.webp` |  |  |  |
| details author | PASS | 山本晃司 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 「アイツらは俺らが処刑する――」 性犯罪者に何もかもを奪われた、若き2人の復讐者。 ヒトを弄び、ヒトの人生を狂わす極悪人は、生殖器を潰すのみ。 歪な正義が爆発する、懲悪ピカレスク堂々開幕!! |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 71 name, chapter 72 name, chapter 89 name |  |  |  |
| chapters | PASS | 288 chapters |  |  |  |
| chapter dates | PASS | 288 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | LINT | Page indices are 1-indexed, but should be 0-indexed |  |  |  |
| page URLs | PASS | 30 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://gorakuweb-content.akamaized.net/.../1 <redacted query values: __token__>` (image/webp (encoding: lossy), 142120 bytes, 844x1200; server Content-Type: application/octet-stream) |  |  |  |
