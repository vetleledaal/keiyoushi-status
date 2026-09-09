# Extension Validation Report

- Extension: tachiyomi-ja.mangatoshokanz-v1.4.1
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 23
- Lint: 1
- Warnings: 0
- Skipped: 12
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7564150377964448106
- Source name: マンガ図書館Z
- Source language: ja
- Selected manga input: popular offset 0: ゆめのかよいじ (`.../43881`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 100 | ゆめのかよいじ (`.../43881`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 50 | ウチ姫４koma (`.../228341`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 50 | What has happened to me ～Testimony of an Uyghur woman 2～ (`.../221541`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | ゆめのかよいじ (`.../43881`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | ゆめのかよいじ (`.../43881`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | error | 0 |  | java.lang.NullPointerException | 1-10s |
| pages | `fetchPageList(chapter)` | skipped | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | ERROR | java.lang.NullPointerException | REVIEW | INSUFFICIENT_EVIDENCE |  |
| pages operation | SKIP | No usable chapter was available |  |  |  |
| popular listing | PASS | 100 entries |  |  |  |
| latest listing | PASS | 50 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=ゆめのかよいじ, URL=`43881` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 201/201 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 201/201 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mangaz-books.j-comi.jp/.../cover1716422319.webp` (image/webp (encoding: lossy), 47044 bytes, 420x595) |  |  |  |
| details identity | PASS | Details preserved selected URL `43881` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | 大野 安之 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 大野 安之, ゆめのかよいじ, 恋愛, SF, 学園, ヤングキングコミックス, 旧版, 電脳, 転校生, 全1巻, 実写映画化, ヤングキング, 1980年代 |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 夏の校舎。少女は建物の中で迷い、不思議な少女に出会う。同級生にその話をすると、「ひょっとするとユーレイかもね」。昔、女生徒同士が愛し合い、片方が亡くなった。残った生徒が後追い自殺をしたというが・・・。あなた――だれ？ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | SKIP | Chapters did not run successfully |  |  |  |
| chapter dates | SKIP | No chapters to check |  |  |  |
| chapter titles | SKIP | No chapters to check |  |  |  |
| chapter URLs | SKIP | No chapters to check |  |  |  |
| duplicate chapter URLs | SKIP | No chapters to check |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | No usable chapter was available |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
