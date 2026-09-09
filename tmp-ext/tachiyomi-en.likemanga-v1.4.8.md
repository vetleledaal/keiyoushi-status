# Extension Validation Report

- Extension: tachiyomi-en.likemanga-v1.4.8
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 35
- Lint: 2
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6236979603959140497
- Source name: LikeManga
- Source language: en
- Selected manga input: latest offset 0: The Cannon-Fodder Concubine's Daughter Just Wants to Survive by Being Adorable (`.../the-cannonfodder-concubine39;s-daughter-just-wants-to-survive-by-being-adorable-39882`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 36 | Revenge of the Baskerville Bloodhound (`.../revenge-of-the-baskerville-bloodhound-3573`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 36 | The Regressed Son of a Duke is an Assassin (`.../the-regressed-son-of-a-duke-is-an-assassin-16402`) |  | 10s+ |
| latest | `fetchLatestUpdates(1)` | success | 36 | The Cannon-Fodder Concubine's Daughter Just Wants to Survive by Being Adorable (`.../the-cannonfodder-concubine39;s-daughter-just-wants-to-survive-by-being-adorable-39882`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 36 | The Youngest Member Filming a Parenting Show Is Adorable (`.../the-youngest-member-filming-a-parenting-show-is-adorable-39297`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | The Cannon-Fodder Concubine's Daughter Just Wants to Survive by Being Adorable (`.../the-cannonfodder-concubine39;s-daughter-just-wants-to-survive-by-being-adorable-39882`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | The Cannon-Fodder Concubine's Daughter Just Wants to Survive by Being Adorable (`.../the-cannonfodder-concubine39;s-daughter-just-wants-to-survive-by-being-adorable-39882`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 15 | Chapter 1 (`.../chapter-1-1778890`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 9 |  |  | 1-10s |

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
| popular listing | PASS | 36 entries |  |  |  |
| latest listing | PASS | 36 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Cannon-Fodder Concubine's Daughter Just Wants to Survive by Being Adorable, URL=`.../the-cannonfodder-concubine39;s-daughter-just-wants-to-survive-by-being-adorable-39882` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 145/145 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 145/145 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://likemanga.ink/.../1781315476-6a2cb794c4ae9-thecannonfodderconcubinesdaughterjustwantstosurviv.jpg` (image/jpeg, 86806 bytes, 250x320) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../the-cannonfodder-concubine39;s-daughter-just-wants-to-survive-by-being-adorable-39882` |  |  |  |
| details thumbnail URL | PASS | `https://likemanga.ink/.../1781315476-6a2cb794c4ae9-thecannonfodderconcubinesdaughterjustwantstosurviv.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Drama, Historical, Romance, Shoujo |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Smart, adaptable, and irresistibly adorable—survival is her specialty! After finding herself inside a classic melodramatic mansion-intrigue story, Gu Nianya starts out as a doomed, insignificant illegitimate daughter, destined to be the lowest-ranking cannon fodder in a household full of schemes and power struggles. What no one realizes is that beneath her innocent, soft-spoken exterior lies a sharp mind and wisdom far beyond her years. Rather than resorting to vicious plots or shameless flattery, she relies on her quick wit and keen insight to navigate dangers, defuse crises, and keep herself safe. Before she knows it, the overlooked little girl everyone ignored has turned the tables—and become the most beloved person in the entire story. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 15 chapters |  |  |  |
| chapter dates | LINT | 1 of 15 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 9 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://like.mgread.io/.../1.jpg` (image/jpeg, 1805520 bytes, 718x8945) |  |  |  |
