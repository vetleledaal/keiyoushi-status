# Extension Validation Report

- Extension: tachiyomi-en.dreammanga-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 34
- Lint: 1
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5840012409601903972
- Source name: Dream-Manga
- Source language: en
- Selected manga input: latest offset 0: Scissor Seven (`.../115229-scissor-seven.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 10 | Scissor Seven (`.../115229-scissor-seven.html`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 10 | In My Previous Life I Wasn't Blessed With a Family, but in This One I'm Surrounded by a Kind One (`.../115220-in-my-previous-life-i-wasnt-blessed-with-a-family-but-in-this-one-im-surrounded-by-a-kind-one.html`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 10 | Scissor Seven (`.../115229-scissor-seven.html`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 10 | In My Previous Life I Wasn't Blessed With a Family, but in This One I'm Surrounded by a Kind One (`.../115220-in-my-previous-life-i-wasnt-blessed-with-a-family-but-in-this-one-im-surrounded-by-a-kind-one.html`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 10 | Scissor Seven (`.../115229-scissor-seven.html`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Scissor Seven (`.../115229-scissor-seven.html`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 10 | Chapter 1 (`.../8063195`) |  | <1s |
| pages | `getPageList(chapter)` | success | 19 |  |  | 1-10s |

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
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 10 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Scissor Seven, URL=`.../115229-scissor-seven.html` |  |  |  |
| latest differs from popular | LINT | Latest page 1 exactly matches popular page 1; verify supportsLatest |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 50/50 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 50/50 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://dream-manga.com/.../259c239644beb1000420d5b13c9a5f.webp` (image/webp (encoding: lossy), 5536 bytes, 100x150) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../115229-scissor-seven.html` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://dream-manga.com/.../scissor-seven.jpg` (image/jpeg, 67914 bytes, 400x600) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | chinese manhua, action, comedy, drama, manhua, mystery, romance, shounen, slice of life, supernatural, wuxia |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | On Chicken Island, Wu Liuqi hides his true identity behind a clumsy cover as a part-time hair salon worker. His chosen weapon is a pair of scissors, and his missions often land him with quirky, low-stakes targets as he tries to make ends meet. The work isn’t glamorous, but it pushes him to sharpen his skills and keep moving, even as the line between his professional life and his uncertain past begins to blur.<br><br>As the missions accumulate, memories surface, hinting at a deeper history and a concealed identity. Wu Liuqi encounters a mix of characters, from a rock-loving dog enthusiast to a tough old fruit vendor and a masked rival assassin named Meihua Shisan. Through each assignment, the story threads together action, comedy, and mystery, gradually revealing the truth behind his origin and the events that reshaped his fate. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 10 chapters |  |  |  |
| chapter dates | PASS | 10 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 19 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://dream-manga.com/.../comix` to `https://read.dream-manga.com/.../comix` (1 redirects); popular: `https://dream-manga.com/.../comix` to `https://read.dream-manga.com/.../comix` (1 redirects); popular: `https://dream-manga.com/.../2` to `https://read.dream-manga.com/.../2` (1 redirects); popular: `https://dream-manga.com/.../115229-scissor-seven.html` to `https://read.dream-manga.com/.../115229-scissor-seven.html` (1 redirects); popular: `https://dream-manga.com/.../index.php <redacted query values: do, subaction, and story>` to `https://read.dream-manga.com/.../index.php <redacted query values: do, subaction, and story>` (1 redirects); popular: `https://dream-manga.com/.../8063195` to `https://read.dream-manga.com/.../8063195` (1 redirects); popular: `https://dream-manga.com/.../2` to `https://read.dream-manga.com/.../2` (1 redirects) |  |  |  |
| page load | PASS | `https://komacdn.com/.../0.webp <redacted query values: s>` (image/webp (encoding: lossy), 102982 bytes, 800x1500) |  |  |  |
