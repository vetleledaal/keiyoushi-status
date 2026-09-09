# Extension Validation Report

- Extension: tachiyomi-ja.mangaupjapan-v1.4.1
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 31
- Lint: 1
- Warnings: 1
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 697820552173578283
- Source name: Manga UP! (Japan)
- Source language: ja
- Selected manga input: popular offset 0: 灰宮先輩は怖くてかわいい (`.../1626`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 50 | 灰宮先輩は怖くてかわいい (`.../1626`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 58 | 灰宮先輩は怖くてかわいい (`.../1626`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 灰宮先輩は怖くてかわいい (`.../1626`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | 灰宮先輩は怖くてかわいい (`.../1626`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 48 | 第1話／第2話／第3話 (`.../316144`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 20 |  |  | 1-10s |

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
| latest listing | PASS | 58 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=灰宮先輩は怖くてかわいい, URL=`.../1626` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 109/109 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 109/109 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://ja-img.manga-up.com/.../1626.webp <redacted query values: hash and expires>` (image/webp (encoding: lossy), 30304 bytes, 640x442) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../1626` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://ja-img.manga-up.com/.../1626.webp <redacted query values: hash and expires>` (image/webp (encoding: lossy), 69930 bytes, 1242x828) |  |  |  |
| details author | PASS | 著者：神山すむ |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 少年, ラブコメ, 学園, ラブコメ |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | うちの高校にいる灰宮先輩は、怖いと有名だ。 というのも、その強い見た目と歯に衣着せぬ言葉遣いが原因らしく… バチバチに開いたピアス！ 灰色のロングウルフカット！！ そして威圧感のある関西弁！！！ だけど、そんな怖い先輩がなぜか僕にだけは優しく接してくれて――!? ”怖い”が”かわいい”に変わっていく、 怖キュン先輩ラブコメ開幕です！ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 48 chapters |  |  |  |
| chapter dates | LINT | All 48 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=48 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 20 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://ja-img.manga-up.com/.../1963i1960_1_001.webp <redacted query values: hash and expires>` (image/webp (encoding: lossy), 150916 bytes, 1080x1536) |  |  |  |
