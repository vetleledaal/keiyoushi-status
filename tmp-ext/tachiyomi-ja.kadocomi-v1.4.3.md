# Extension Validation Report

- Extension: tachiyomi-ja.kadocomi-v1.4.3
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 32
- Lint: 1
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8396089563187142394
- Source name: カドコミ
- Source language: ja
- Selected manga input: latest offset 0: 白河くんと黒谷くん (`.../KC_008378_S`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 50 | その悪役貴族、ママヒロインが好きすぎる ～真摯な努力で最強となり不遇な推しキャラ助けまくる～ (`.../KC_006213_S`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 100 | 白河くんと黒谷くん (`.../KC_008378_S`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 白河くんと黒谷くん (`.../KC_008378_S`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | 白河くんと黒谷くん (`.../KC_008378_S`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 2 |  白河くんと黒谷くん　試し読み (`.../viewer <redacted query values: episodeId and imageSizeType>`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 13 |  |  | 1-10s |

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
| popular listing | PASS | 50 entries |  |  |  |
| latest listing | PASS | 100 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=白河くんと黒谷くん, URL=`.../KC_008378_S` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 151/151 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 151/151 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.comic-walker.com/.../coverImage_9d3e72899a244cddba5fca78cb2a614e.jpg` (image/jpeg, 41740 bytes, 350x498) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../KC_008378_S` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.comic-walker.com/.../coverImage_9d3e72899a244cddba5fca78cb2a614e.jpg` |  |  |  |
| details author | PASS | 佐倉まめもち |  |  |  |
| details artist | PASS | 佐倉まめもち |  |  |  |
| details genres | PASS | BL, 恋愛, 溺愛, いちゃラブ, 高校生, ツンデレ |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 愛重めの無気力モテ男子×隠れえっちなツンデレ男子<br>“バズり連発”の『しろくろシリーズ』が待望の書籍化！！<br><br>「かわいいね 黒谷」<br><br>いつもやる気のない白河は真面目な黒谷に怒られてばかり。<br>教室ではこの光景が当たり前になっていた――。<br>しかし実はこの二人、周りに内緒でお付き合い中！<br><br>二人きりになると、白河は黒谷を溺愛し、独占したくてたまらない。<br>一方の黒谷も白河に触れられると、えっちな甘えんぼうに！！<br>そんな二人のチョコレートみたいに甘くとろけるえちかわBL!<br><br>☆佐倉まめもち初コミックス☆<br>本編ではSNS作品の加筆に加え、大ボリューム描きおろし61ページを収録！ |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 1 name, chapter 2 name |  |  |  |
| chapters | PASS | 2 chapters |  |  |  |
| chapter dates | PASS | 2 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 13 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.comic-walker.com/.../1_f6071ff3e1d74a9b92cbc443f85b4cb1c24f44bb7c6c1a356dfe5424539736d9.webp <redacted query values: Policy, Signature, and Key-Pair-Id>` (image/webp (container: extended), 103586 bytes, 650x924; server Content-Type: application/octet-stream) |  |  |  |
