# Extension Validation Report

- Extension: tachiyomi-en.teamshadowi-v1.6.2
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 33
- Lint: 0
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1326600535134927871
- Source name: Team Shadowi
- Source language: en
- Selected manga input: popular offset 0: The Student, The Witch, and The Academy (`.../the-student-the-witch-and-the-academy`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 8 | The Student, The Witch, and The Academy (`.../the-student-the-witch-and-the-academy`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 8 | The Student, The Witch, and The Academy (`.../the-student-the-witch-and-the-academy`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | The Student, The Witch, and The Academy (`.../the-student-the-witch-and-the-academy`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | The Student, The Witch, and The Academy (`.../the-student-the-witch-and-the-academy`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 81 | Chapter 1 (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 12 |  |  | <1s |

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
| popular listing | PASS | 8 entries |  |  |  |
| latest listing | PASS | 8 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Student, The Witch, and The Academy, URL=`.../the-student-the-witch-and-the-academy` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 17/17 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 17/17 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://images.team-shadowi.com/.../cover.jpg` (image/jpeg, 178800 bytes, 840x1120) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../the-student-the-witch-and-the-academy` |  |  |  |
| details thumbnail URL | PASS | `https://images.team-shadowi.com/.../cover.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Comedy, Drama, Romance, Classmate/s, Full Color, Webtoon, Love Triangle/s, Ronin Student, Obsessive Female Lead |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | For Nam Juho, life as a repeat student aiming for med school is supposed to be simple: study, eat convenience store kimbap, and sleep, preferably in that order.<br><br>But peace is impossible when Yeo Jiwoo, his eccentric classmate from the same cram school, suddenly decides he’s her new favorite target.<br><br>From stolen pens and playful pranks to unsolicited “study motivation,” Jiwoo seems determined to turn Juho’s quiet, disciplined life into a daily comedy of chaos. He swears she’s doing it just to annoy him… but why does his heart race every time she flashes that mischievous smile?<br><br>Between mock exams, caffeine highs, and emotional confusion, Juho finds himself stuck in the most distracting kind of competition—a love-hate study war that’s way harder than any entrance test.<br><br>Who knew the toughest subject in cram school would be romance? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 81 chapters |  |  |  |
| chapter dates | PASS | 81 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 12 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://images.team-shadowi.com/.../page_001.webp` (image/webp (encoding: lossy), 728766 bytes, 690x16000) |  |  |  |
