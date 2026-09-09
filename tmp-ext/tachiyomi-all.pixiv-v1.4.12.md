# Extension Validation Report

- Extension: tachiyomi-all.pixiv-v1.4.12
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 35
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.a
- Source ID: 4964829535501435742
- Source name: Pixiv
- Source language: en
- Selected manga input: latest offset 0: You Crossed the Line (`.../254120`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 50 | 剣盾つめつめ (`.../141540`) |  | 10s+ |
| popular_next | `fetchPopularManga(2)` | success | 50 | ちい乗せ (`.../345498`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 50 | You Crossed the Line (`.../254120`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 50 | PPT夢本【サンプル】 (`.../149481096`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 4 | You Crossed the Line (`.../254120`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | You Crossed the Line (`.../254120`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 96 | Who's a good boy? (`.../122346820`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 1 |  |  | 1-10s |

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
| popular listing | PASS | 50 entries |  |  |  |
| latest listing | PASS | 50 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=You Crossed the Line, URL=`.../254120` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 204/204 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 204/204 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i.pximg.net/.../149483439_p0_master1200.jpg` (image/png, 611499 bytes, 782x410) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../254120` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; Thumbnail URL `https://i.pximg.net/.../2EyRzO1DinSBPT4r08ztrSjnK4tSNNhx.png` was not downloaded |  |  |  |
| details author | PASS | MadEverette |  |  |  |
| details artist | PASS | MadEverette |  |  |  |
| details genres | PASS | 漫画, 女攻め, 恋愛, 恋人, 日常, S女, 女性上位, 男性受け, 純愛, 創作男女, M男, 巨乳, 創作漫画, 大学生, カップル, ラブコメ, おしり, おしっこ, 全裸, 膀胱, 4コマ, R-18, かわいい |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | A story of how childhood friends of 20 years evolve into a femdom couple! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 96 chapters |  |  |  |
| chapter dates | PASS | 96 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 1 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://i.pximg.net/.../122346820_p0.png` (image/png, 3066818 bytes, 3164x4096) |  |  |  |
