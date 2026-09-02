# Extension Validation Report

- Extension: tachiyomi-ja.zerosumonline-v1.4.1
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 28
- Lint: 1
- Warnings: 0
- Skipped: 7
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8525996702535864887
- Source name: Zerosum Online
- Source language: ja
- Selected manga input: popular offset 0: 高飛車皇女は黙ってない (`.../takabisya`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 101 | 高飛車皇女は黙ってない (`.../takabisya`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 高飛車皇女は黙ってない (`.../takabisya`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | 高飛車皇女は黙ってない (`.../takabisya`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 3 | 第1章 (`.../185`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 36 |  |  | 1-10s |

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
| popular listing | PASS | 101 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=高飛車皇女は黙ってない, URL=`.../takabisya` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 102/102 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 102/102 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://contents.zerosumonline.com/.../89.webp` (image/webp (encoding: lossy), 56598 bytes, 350x498) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../takabisya` |  |  |  |
| details thumbnail URL | PASS | `https://contents.zerosumonline.com/.../89.webp` |  |  |  |
| details author | PASS | コミック：月煮ゆう／原作：柊と灯／キャラクター原案：くろでこ |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 「お黙りになって！」<br>悪役令嬢の断罪劇。最近よくある光景を切り裂くように、帝国皇女クローディアが現れた。圧倒的な存在感を放つ彼女は、あっという間にその場を支配し、責任感皆無な王子に夢見る少女、悪役にされた公爵令嬢に現実をつきつけていく！<br>従者のベリルを引き連れて、忍び寄る悪事を次々と薙ぎ払う、帝国皇女の痛快ラブファンタジー！<br><br><br><br>タカビシャコウジョハダマッテナイ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 3 chapters |  |  |  |
| chapter dates | PASS | 3 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 36 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://contents.zerosumonline.com/.../1.webp` (image/webp (encoding: lossy), 527810 bytes, 1512x2150) |  |  |  |
