# Extension Validation Report

- Extension: tachiyomi-ja.mangaspa-v1.4.5
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 31
- Lint: 0
- Warnings: 1
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2566686121922544500
- Source name: Manga SPA
- Source language: ja
- Selected manga input: popular offset 0: 令和のおもちゃ ウーピン (`.../b8686a211ebfa`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 32 | 令和のおもちゃ ウーピン (`.../b8686a211ebfa`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 24 | 飛鳥クリニックは今日も雨 (`.../68aaf1a9e2a80`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 令和のおもちゃ ウーピン (`.../b8686a211ebfa`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | 令和のおもちゃ ウーピン (`.../b8686a211ebfa`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 22 | 第1話 あゝ人生に涙あり (`.../5fbbe0d610d7b`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 10 |  |  | 1-10s |

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
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=令和のおもちゃ ウーピン, URL=`.../b8686a211ebfa` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 57/57 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 57/57 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-public.comici.jp/.../20250916133253871E79550821D50AC9E2BEA0FD35F285283-lg.webp` (image/webp (encoding: lossy), 24694 bytes, 720x378; server Content-Type: application/octet-stream) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../b8686a211ebfa` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn-public.comici.jp/.../20250916133253871E79550821D50AC9E2BEA0FD35F285283.png` (image/png, 4768522 bytes, 2560x1344) |  |  |  |
| details author | PASS | 大石浩二 |  |  |  |
| details artist | PASS | 大石浩二 |  |  |  |
| details genres | PASS | ギャグ・コメディ, ヒューマンドラマ, マンガSPA!オリジナル |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 『いぬまるだしっ』『トマトイプ―のリコピン』の大石浩二先生が描く新連載！<br>おじさんにとって、令和の世は生きづらい。上司からは理不尽な扱いを受けながら、部下にはハラスメントしないように人一倍気を遣う。頑張らなきゃいけないのに、なんだかいつも体が痛い。<br>「体力も気力も行動力も、情熱もない…」<br>絶望するおじさんの前に突如、謎のおもちゃ・ウーピンが現れた。<br>「おじさんの凄さをもっとみんなに知ってもらわなきゃ！」<br>ウーピンが魔法のレトロ玩具でおじさんに厳しい日本社会を変えていく！ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 22 chapters |  |  |  |
| chapter dates | PASS | 22 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 10 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://viewer.mangaspa.nikkan-spa.jp/.../master-1758707809886-01.jpg <redacted query values: Expires, Signature, and Key-Pair-Id> 11, 7, 8, 14, 0, 4, 15, 2, 6, 12, 3, 1, 13, 10, 5\]` (image/jpeg, 2015797 bytes, 2560x3371) |  |  |  |
