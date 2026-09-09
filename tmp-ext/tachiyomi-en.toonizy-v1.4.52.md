# Extension Validation Report

- Extension: tachiyomi-en.toonizy-v1.4.52
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 26
- Lint: 0
- Warnings: 3
- Skipped: 7
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madaralegacy
- Source ID: 5404499323728358840
- Source name: Toonizy
- Source language: en
- Selected manga input: latest offset 0: The Alpha Blueprint (`.../the-alpha-blueprint`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 24 | My Stepmom (`.../my-stepmom`) |  | 10s+ |
| popular_next | `fetchPopularManga(2)` | success | 24 | The Strange Lady In Our Town (`.../the-strange-lady-in-our-town`) |  | 10s+ |
| latest | `fetchLatestUpdates(1)` | success | 24 | The Alpha Blueprint (`.../the-alpha-blueprint`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 24 | Spirit Possession (`.../spirit-possession`) |  | 10s+ |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | The Alpha Blueprint (`.../the-alpha-blueprint`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | error | 0 |  | java.lang.NullPointerException | 10s+ |
| chapters | `fetchChapterList(manga)` | success | 15 | Chapter 1 - The Alpha Blueprint (`https://toonizy.com/.../p2911-ch-001 <redacted query values: style>`) |  | 10s+ |
| pages | `fetchPageList(chapter)` | success | 46 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | ERROR | java.lang.NullPointerException | REVIEW | INSUFFICIENT_EVIDENCE |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Alpha Blueprint, URL=`.../the-alpha-blueprint` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=Fatal Lessons in this Pandemic, URL=`.../fatal-lessons-in-this-pandemic` at page 1 offset 23 and page 2 offset 1 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://toonizy.com/.../thumbnail-161x238.jpg` (image/jpeg, 12116 bytes, 161x238) |  |  |  |
| details identity | SKIP | No details manga URL to compare |  |  |  |
| details thumbnail URL | SKIP | No details manga to check |  |  |  |
| details author | SKIP | No details manga to check |  |  |  |
| details artist | SKIP | No details manga to check |  |  |  |
| details genres | SKIP | No details manga to check |  |  |  |
| details status | SKIP | No details manga to check |  |  |  |
| details description | SKIP | No details manga to check |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 15 chapters |  |  |  |
| chapter dates | PASS | 15 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | UNUSUAL | All 15 chapter URLs are absolute |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 46 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://toonizy.com/.../manga <redacted query values: m_orderby>` to `https://toonizy.com <redacted query values: m_orderby>` (1 redirects); latest: `https://toonizy.com/.../manga <redacted query values: m_orderby>` to `https://toonizy.com <redacted query values: m_orderby>` (1 redirects); latest: `https://toonizy.com/.../thumbnail-161x238.jpg` to `https://cdn.toonizy.com/.../thumbnail-161x238.jpg` (1 redirects); pages: `https://toonizy.com/.../001.jpg` to `https://cdn.toonizy.com/.../001.jpg` (1 redirects) |  |  |  |
| page load | PASS | `https://toonizy.com/.../001.jpg` (image/jpeg, 405173 bytes, 720x4096) |  |  |  |
