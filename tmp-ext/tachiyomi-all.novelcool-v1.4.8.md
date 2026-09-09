# Extension Validation Report

- Extension: tachiyomi-all.novelcool-v1.4.8
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 36
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.a
- Source ID: 7570101320206504111
- Source name: NovelCool
- Source language: en
- Selected manga input: latest offset 0: Resetting Lady (`.../Resetting-Lady.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Martial Lord (`.../Martial-Lord.html`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 20 | MF Ghost (`.../MF-Ghost.html`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 20 | Resetting Lady (`.../Resetting-Lady.html`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | Awai No Enjin (`.../Awai-No-Enjin.html`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Resetting Lady (`.../Resetting-Lady.html`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Resetting Lady (`.../Resetting-Lady.html`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 126 | Chapter 1 (`.../8428352`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 33 |  |  | 1-10s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Resetting Lady, URL=`.../Resetting-Lady.html` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://img.novelcool.com/.../Resetting_Lady4472.png` (image/png, 130166 bytes, 200x287) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../Resetting-Lady.html` |  |  |  |
| details thumbnail URL | PASS | `https://img.novelcool.com/.../Resetting_Lady4472.png` |  |  |  |
| details author | PASS | Baekwoo |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Ongoing, Reincarnation, Official colored, Psychological, Long strip, Romance, Fantasy, Adaptation, Full color, Tragedy, Reincarnation, Official colored, Psychological, Long strip, Romance, Fantasy, Adaptation, Full color, Tragedy, Reincarnation, Official colored, Psychological, Long strip, Romance, Fantasy, Adaptation, Full color, Tragedy, 2022, Ongoing |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | I entered the world of a novel suddenly. I thought that I could return to reality by falling in love, but death was what awaited me in the end. Defenestration, strangulation, poisoning, drowning, and burning to death... Even after dying a hundred times and returning, the novel still doesn\t end... Karen Haier, who greets her 117th birthday trapped within a novel, now decides to become a murderer. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 126 chapters |  |  |  |
| chapter dates | LINT | 22 of 126 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=22 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 33 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://en4.movietop.cc/.../b3de4c09290f03a29836f8ef47429108.webp <redacted query values: acc and exp>` (image/webp (encoding: lossy), 37776 bytes, 720x1000) |  |  |  |
