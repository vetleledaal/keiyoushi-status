# Extension Validation Report

- Extension: tachiyomi-all.taddyink-v1.4.3
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 29
- Lint: 2
- Warnings: 1
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2332326521515456967
- Source name: Taddy INK (Webtoons)
- Source language: all
- Selected manga input: popular offset 0: To Shield the Light (`https://taddy.org/.../cc2dba60-023d-48cd-9298-393f51f2e7f9`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 25 | To Shield the Light (`https://taddy.org/.../cc2dba60-023d-48cd-9298-393f51f2e7f9`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 25 | Saint Crusader (`https://taddy.org/.../7e5c3bb1-ae66-4455-a493-f831873c108d`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | To Shield the Light (`https://taddy.org/.../cc2dba60-023d-48cd-9298-393f51f2e7f9`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | To Shield the Light (`https://taddy.org/.../cc2dba60-023d-48cd-9298-393f51f2e7f9`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 4 | Prologue  (`https://taddy.org/.../cc2dba60-023d-48cd-9298-393f51f2e7f9`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 23 |  |  | <1s |

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
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=To Shield the Light, URL=`https://taddy.org/.../cc2dba60-023d-48cd-9298-393f51f2e7f9` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | LINT | 51/51 listing manga have titles and URLs; popular: all absolute; popular_next: all absolute; search: all absolute; Absolute URL examples: popular entry 1: `https://taddy.org/.../cc2dba60-023d-48cd-9298-393f51f2e7f9`, popular entry 2: `https://taddy.org/.../efc9db86-f392-4206-be5f-2369a5dcff01`, popular entry 3: `https://taddy.org/.../e3348491-cbab-484c-9b14-e985cbbeee4e` |  |  |  |
| thumbnail URLs | PASS | 51/51 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://ax1.taddy.org/.../cover-sm.webp` (image/webp (encoding: lossy), 46976 bytes, 320x480; server Content-Type: application/octet-stream) |  |  |  |
| details identity | PASS | Details preserved selected URL `https://taddy.org/.../cc2dba60-023d-48cd-9298-393f51f2e7f9` |  |  |  |
| details thumbnail URL | PASS | `https://ax1.taddy.org/.../cover-sm.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Romance, Fantasy, Drama |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Lillia Fairling believes she is saving a child when she enters a dismal manor. Now trapped, she must try to escape. Only behind every door lurks a monster, and danger eyes her from every shadow. |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 2 name, chapter 4 name |  |  |  |
| chapters | PASS | 4 chapters |  |  |  |
| chapter dates | PASS | 4 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | UNUSUAL | All 4 chapter URLs are absolute |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 23 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://ay1.taddy.org/.../story.webp` (image/webp (encoding: lossy), 10126 bytes, 800x1280; server Content-Type: application/octet-stream) |  |  |  |
