# Extension Validation Report

- Extension: tachiyomi-ja.firecross-v1.4.3
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 31
- Lint: 1
- Warnings: 0
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: clipstudioreader
- Source ID: 6276622162610581454
- Source name: FireCross
- Source language: ja
- Selected manga input: popular offset 0: ジゼルの錬金飴 (`.../559`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 24 | ジゼルの錬金飴 (`.../559`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 24 | いつでも自宅に帰れる俺は、異世界で行商人をはじめました (`.../377`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 2 | ジゼルの錬金飴 (`.../562`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | ジゼルの錬金飴 (`.../559`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 24 | 第1話 (`.../%7B%22token%22:%224alvg2yAfKro8jPnydx9QL7UY4r3Jl4vkVJg7lw4%22,%22id%22:%2214076%22%7D`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 26 |  |  | 1-10s |

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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 1: title=ジゼルの錬金飴, URL=`.../559` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 50/50 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 50/50 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://firecross.jp/.../5bdda222-d1df-4ae5-bad3-164e7b3f6aa2.jpg` (image/jpeg, 215651 bytes, 980x980) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../559` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | 漫画 katoson, 原作 斯波, キャラクター原案 LINO |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | ファンタジー, スローライフ, お仕事モノ, 女性主人公 |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 錬金術師のジゼルは、勤続年数のわりに大したアイテムが作れないからと錬金ギルドを突然クビにされてしまう。すっかりしょげて下宿先に帰るが、優しいオーナー夫婦に温かく励まされて心機一転!!　周囲の人々に喜んでもらえるような錬金アイテムを作って生活していこうと決意する。さっそく取りかかったのは、疲労回復などに効果のあるジゼル特製の『錬金飴』作りで――!? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 24 chapters |  |  |  |
| chapter dates | PASS | 24 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 26 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://firecross.jp/.../diazepam_hybrid.php <redacted query values: mode, file, reqtype, and param>` (image/jpeg, 325443 bytes, 1000x1421) |  |  |  |
