# Extension Validation Report

- Extension: tachiyomi-es.mangamx-v1.4.19
- Input artifact: JAR
- Generated at: 2026-09-09T18:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2202687009511923782
- Source name: MangaOni
- Source language: es
- Selected manga input: latest offset 0: One Punch-Man (`.../one-punch-man`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 18 | Boku no Hero Academia (`.../boku-no-hero-academia`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 18 | Berserk (`.../berserk`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 12 | One Punch-Man (`.../one-punch-man`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 12 | Haimiya-senpai wa Kowakute Kawaii (`.../haimiya-senpai-wa-kowakute-kawaii`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | One Punch-Man (`.../one-punch-man`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | One Punch-Man (`.../one-punch-man`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 340 | Capítulo 0 — One-Shot Especial (`.../698243`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 17 |  |  | 1-10s |

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
| latest listing | PASS | 12 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=One Punch-Man, URL=`.../one-punch-man` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 61/61 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 61/61 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://oni.ntr-files.online/.../cover.jpg <redacted query values: 1754366370>` (image/jpeg, 166820 bytes, 512x804) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../one-punch-man` |  |  |  |
| details thumbnail URL | PASS | `https://oni.ntr-files.online/.../cover.jpg <redacted query values: 1754366370>` |  |  |  |
| details author | PASS | ONE, Murata Yuusuke |  |  |  |
| details artist | PASS | ONE, Murata Yuusuke |  |  |  |
| details genres | PASS | Comedia, Acción, Sobrenatural, Seinen, Ciencia ficción |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | ¡Sigue la vida de un héroe promedio que gana todas sus peleas con un solo puño! Esto es causa de un montón de frustración y ahora ya no se siente la adrenalina y la emoción de una dura pelea. Tal vez ese riguroso entrenamiento para volverse fuerte no valió la pena. Después de todo, ¿qué tiene de bueno tener un poder tan aplastante? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 340 chapters |  |  |  |
| chapter dates | PASS | 340 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 17 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://oni.ntr-files.online/.../OnePunch-Man-Captulo000OneshotSpecial-1.webp <redacted query values: up>` (image/webp (encoding: lossy), 13576 bytes, 458x661) |  |  |  |
