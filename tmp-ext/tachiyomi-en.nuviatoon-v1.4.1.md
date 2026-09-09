# Extension Validation Report

- Extension: tachiyomi-en.nuviatoon-v1.4.1
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 33
- Lint: 0
- Warnings: 0
- Skipped: 3
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 9071935154458913856
- Source name: Nuvia Toon
- Source language: en
- Selected manga input: latest offset 0: The mansion awaits spring (`.../novel`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 18 | Heart Aching (`.../heart-aching`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 18 | The Forgotten Field [Novel] (`.../the-forgotten-field-novel`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 18 | The mansion awaits spring (`.../novel`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 18 | The Forgotten Field [Novel] (`.../the-forgotten-field-novel`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 2 | The Mansion Awaits Spring (`.../the-mansion-awaits-spring`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | The mansion awaits spring (`.../novel`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 148 | Chapter 1 (`.../1 <redacted query values: id>`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 0 |  |  | 1-10s |

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
| popular listing | PASS | 18 entries |  |  |  |
| latest listing | PASS | 18 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 1: title=The mansion awaits spring, URL=`novel` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 74/74 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 74/74 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://nuviatoon.com/.../the-mansion-awaits-spring-1788456528846.png` (image/png, 3292961 bytes, 1024x1536) |  |  |  |
| details identity | PASS | Details preserved selected URL `novel` |  |  |  |
| details thumbnail URL | PASS | `https://nuviatoon.com/.../the-mansion-awaits-spring-1788456528846.png` |  |  |  |
| details author | PASS | Lee Bo-ra |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Fantasy, Romance, Female Protagonist, Drama |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | "I’ve fallen in love." April is unilaterally dumped by her fiancé. To the people of the Grand Duchy of Dieus, an engagement was a promise to become a lifelong partner. Killing the one who betrayed their daughter was the parents' rightful duty. However, the assassination attempt failed, and as a consequence, the head and wife of the Runos family were hanged. April, being a minor at the time, received a sentence of seven years of imprisonment. After seven years had passed and she had served her full term, April desired only one thing: honor. The honor her parents risked death to protect. The honor of April herself, her family, and Runos. For that, she was willing to willingly live up to the expectations of a world that considered her a villain. But then... "We are arresting you on charges of serial murders committed over the past three years." Armed police officers block the entrance to the mansion. And they are framing her with crimes she was unable to commit during her seven years of imprisonment. "...It’s Dieus again." April said, looking at Pejin, her former fiancé’s younger brother, who stood at the front of the police force. What was the purpose of Pejin Dieus’s appearance at the mansion? And will April truly be able to clear her name and restore her family's honor? A full-length romantic fantasy by author Lee Bo-ra, *The Mansion Waits for Spring |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 148 chapters |  |  |  |
| chapter dates | PASS | 148 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | FAIL | Page list is empty (0 pages) | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
