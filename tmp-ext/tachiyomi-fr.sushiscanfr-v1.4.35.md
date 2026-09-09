# Extension Validation Report

- Extension: tachiyomi-fr.sushiscanfr-v1.4.35
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 34
- Lint: 2
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 3196884165456788667
- Source name: Sushiscan.fr
- Source language: fr
- Selected manga input: latest offset 0: The Ruined World Was Mistaken for a Game (`.../the-ruined-world-was-mistaken-for-a-game`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 30 | Solo Leveling (`.../na-honjaman-level-up`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 30 | Ma bonne tutrice (`.../ma-bonne-tutrice`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 30 | The Ruined World Was Mistaken for a Game (`.../the-ruined-world-was-mistaken-for-a-game`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 30 | I Became an Apartment Security Manager (`.../i-became-an-apartment-security-manager`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | The Ruined World Was Mistaken for a Game (`.../the-ruined-world-was-mistaken-for-a-game`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | The Ruined World Was Mistaken for a Game (`.../the-ruined-world-was-mistaken-for-a-game`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 10 | Chapitre 0 (`.../the-ruined-world-was-mistaken-for-a-game-chapitre-0`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 6 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Ruined World Was Mistaken for a Game, URL=`.../the-ruined-world-was-mistaken-for-a-game` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 121/121 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 121/121 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://sushiscan.fr/.../cover-3-205x300.webp` (image/webp (container: extended), 22688 bytes, 205x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../the-ruined-world-was-mistaken-for-a-game` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://sushiscan.fr/.../cover-3.webp` (image/webp (container: extended), 262162 bytes, 1037x1517) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Comédie, Drame, Fantasy, Mystère, Tragédie, Webtoon, Manhwa |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | « Faisons croire qu’un monde en ruines n’est qu’un jeu. » Kim Jinwoo, directeur de jeu, est un jour invoqué dans un autre monde nommé Arsilan. Après avoir lutté pendant des années pour survivre dans cet univers impitoyable, il finit par devenir un Archimage, puis atteint le rang de Transcendant. Pourtant, malgré toute sa puissance, Arsilan est au bord de la destruction…<br><br>Nom alternatif : Mistook a Ruined World for a Game, Tricking Them Into Believing a Ruined World Is a Game, 망한 세계를 게임으로 착각시켰다 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 10 chapters |  |  |  |
| chapter dates | LINT | All 10 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=10 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 6 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://s22.yaoiscan.fr/.../001.avif` (image/avif (format: avif), 534591 bytes, 690x15922) |  |  |  |
