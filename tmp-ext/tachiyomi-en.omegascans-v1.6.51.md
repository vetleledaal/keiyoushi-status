# Extension Validation Report

- Extension: tachiyomi-en.omegascans-v1.6.51
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 36
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1534451209269193504
- Source name: Omega Scans
- Source language: en
- Selected manga input: popular offset 0: Sex Stopwatch (`.../sex-stopwatch`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 12 | Sex Stopwatch (`.../sex-stopwatch`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 12 | Desire Realization App (`.../desire-realization-app`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 12 | Money Games (`.../money-games`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 12 | Regressed Warrior’s Female Dominance Diary (`.../regressed-warriors-female-dominance-diary`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Sex Stopwatch (`.../sex-stopwatch`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Sex Stopwatch (`.../sex-stopwatch`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 156 | Chapter 1 (`.../chapter-1`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 11 |  |  | 1-10s |

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
| popular listing | PASS | 12 entries |  |  |  |
| latest listing | PASS | 12 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Sex Stopwatch, URL=`.../sex-stopwatch` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 49/49 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 49/49 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://media.omegascans.org/.../vzq49pwb62fcuxfgmllu3cr1.webp` (image/webp (container: extended), 109490 bytes, 800x1120) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../sex-stopwatch` |  |  |  |
| details thumbnail URL | PASS | `https://media.omegascans.org/.../vzq49pwb62fcuxfgmllu3cr1.webp` |  |  |  |
| details author | PASS | Serious |  |  |  |
| details artist | PASS | Toptoon |  |  |  |
| details genres | PASS | Fantasy, Manhwa |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | “Hey, Loser Joo. Did you just secretly look at my chest and panties?” Just before the ordinary repeating student, loser Joo Ohyoung, was going to get hit by a popular girl with a sexy body, he awakened the king’s ability and stopped time…! “How dare you try to hit me? This is punishment for trying to lay a hand on this body!!” Squish <3 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 156 chapters |  |  |  |
| chapter dates | PASS | 156 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 11 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://media.omegascans.org/.../01.jpg` (image/jpeg, 5252400 bytes, 720x13490; server Content-Type: image/jpg) |  |  |  |
