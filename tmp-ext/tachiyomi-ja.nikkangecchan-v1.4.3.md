# Extension Validation Report

- Extension: tachiyomi-ja.nikkangecchan-v1.4.3
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 27
- Lint: 2
- Warnings: 0
- Skipped: 7
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5200293225675847390
- Source name: Nikkangecchan
- Source language: ja
- Selected manga input: popular offset 0: ほぼ日刊アルマジロのジョン (`.../john`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 17 | ほぼ日刊アルマジロのジョン (`.../john`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | ほぼ日刊アルマジロのジョン (`.../john`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | ほぼ日刊アルマジロのジョン (`.../john`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 725 | 001 - タオルをもむ (`.../1`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 1 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 17 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=ほぼ日刊アルマジロのジョン, URL=`.../john` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 18/18 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 18/18 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://nikkangecchan.jp/.../image` (image/png, 1107808 bytes, 1300x630) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../john` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 週刊少年チャンピオンで大絶賛連載中のヴァンパイヤ・コメディ「吸血鬼すぐ死ぬ」に登場する『ヌヌヌー』な口調でおなじみの\[アルマジロのジョン\]。そんな人気者ジョンのゆるゆるホッコリなカラーイラストを月〜金のほぼ毎日拝める珠玉の連載でございます。癒されたい方、寄っといで!! 毎週月〜金17時頃更新!! |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 18 name, chapter 113 name, chapter 144 name, chapter 247 name, chapter 292 name, chapter 401 name |  |  |  |
| chapters | PASS | 725 chapters |  |  |  |
| chapter dates | LINT | All 725 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=725 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 1 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://nikkangecchan.jp/.../image` (image/jpeg, 179218 bytes, 1200x1200) |  |  |  |
