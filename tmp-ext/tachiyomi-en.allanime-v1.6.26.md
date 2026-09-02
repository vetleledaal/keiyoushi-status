# Extension Validation Report

- Extension: tachiyomi-en.allanime-v1.6.26
- Input artifact: JAR
- Generated at: 2026-09-02T15:00:00Z
- Commit: 81336186c4ddb47e2a35eeb9ae58ceb10e8dc995
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
- Source ID: 4709139914729853090
- Source name: AllManga
- Source language: en
- Selected manga input: latest offset 0: Haunted Peak (`.../csoMGu5P8NiczzJLE`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Solo Leveling (`.../SFrub9DDGMrmdZWyh`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 20 | Welcome to Demon School! Iruma-kun (`.../M8NoyT7kcBS3CTDch`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 20 | Haunted Peak (`.../csoMGu5P8NiczzJLE`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 20 | The Heroines Want Me Dead! (`.../6ecQTsGGYFQA8YqNe`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Haunted Peak (`.../csoMGu5P8NiczzJLE`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Haunted Peak (`.../csoMGu5P8NiczzJLE`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 19 | Chapter 1: The Boy and the Mountain (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 60 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Haunted Peak, URL=`csoMGu5P8NiczzJLE` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://s4.anilist.co/.../bx209863-3O5yX3HSUOi7.jpg` (image/jpeg, 90792 bytes, 460x654) |  |  |  |
| details identity | PASS | Details preserved selected URL `csoMGu5P8NiczzJLE` |  |  |  |
| details thumbnail URL | PASS | `https://s4.anilist.co/.../bx209863-3O5yX3HSUOi7.jpg` |  |  |  |
| details author | PASS | Minenami Ryo |  |  |  |
| details artist | PASS | Minenami Ryo |  |  |  |
| details genres | PASS | Psychological, Drama, Mystery, Seinen, theme:rural, theme:wilderness, theme:male_protagonist, School |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | High schooler Miko, who thought he'd be inheriting his grandfather's mountain, has lost his crush to his friend and is at the bottom of his school's hierarchy. His one solace was the mountain, but now a mysterious masked man is building a small cabin there... Tagline: Am I weak? A tale of love and hate spiraling around a mountain.<br><br><br><br>(Source: MANGA Plus)<br><br>\[MyAnimeList\](https://myanimelist.net/.../192247)<br>\[AniList\](https://anilist.co/.../209863)<br><br><br>Alternative Titles:<br>- Haunted Peak<br>- Sangeki<br>- 山劇 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 19 chapters |  |  |  |
| chapter dates | PASS | 19 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 60 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://aln.youtube-anime.com/.../1.png` (image/jpeg, 179019 bytes, 784x1145; server Content-Type: image/png) |  |  |  |
