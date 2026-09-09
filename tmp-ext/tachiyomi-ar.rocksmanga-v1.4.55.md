# Extension Validation Report

- Extension: tachiyomi-ar.rocksmanga-v1.4.55
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 34
- Lint: 1
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madaralegacy
- Source ID: 3301038340499911137
- Source name: Rocks Manga
- Source language: ar
- Selected manga input: popular offset 0: Salty Studio (`.../salty-studio`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 30 | Salty Studio (`.../salty-studio`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 30 | I Kept Spoiling a Female Knight Who Knew Nothing but Fighting (`.../i-kept-spoiling-a-female-knight-who-knew-nothing-but-fighting`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 30 | Salty Studio (`.../salty-studio`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 30 | I Kept Spoiling a Female Knight Who Knew Nothing but Fighting (`.../i-kept-spoiling-a-female-knight-who-knew-nothing-but-fighting`) |  | 10s+ |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 12 | Drifting Net Cafe (`.../drifting-net-cafe`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Salty Studio (`.../salty-studio`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 2 | الفصل 1: البداية (`https://rocksmanga.com/.../1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 3 |  |  | 1-10s |

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
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 4: title=Salty Studio, URL=`.../salty-studio` |  |  |  |
| latest differs from popular | LINT | Latest page 1 exactly matches popular page 1; verify supportsLatest |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 132/132 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 132/132 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://rocksmanga.com/.../Screenshot_20260905-024211_Chrome-280x400.jpg` (image/jpeg, 23449 bytes, 280x400) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../salty-studio` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | OMYO OMYO |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | دراما, رومانسي, شريحة من الحياة, شوجو, كوميدي |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | تلتقي المصادفة بالطموح في استوديو صغير، حيث تتقاطع حياة شابة تسعى خلف حلمها مع أشخاص لم تكن تتوقع أن يصبحوا جزءًا من قصتها. بين العمل، الصداقة، والمواقف اليومية، تبدأ حكاية مليئة بالمواقف الطريفة والمشاعر التي تنمو بهدوء… فهل تكون هذه البداية لقصة حب لم تكن في الحسبان؟<br><br>Alternative Names: Salty Studio |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 2 chapters |  |  |  |
| chapter dates | PASS | 2 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | UNUSUAL | All 2 chapter URLs are absolute |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 3 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | search: `https://rocksmanga.com <redacted query values: s>` to `https://rocksmanga.com <redacted query values: s>` (1 redirects) |  |  |  |
| page load | PASS | `https://rocksmanga.com/.../001.webp` (image/webp (container: extended), 678746 bytes, 720x7732) |  |  |  |
