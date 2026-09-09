# Extension Validation Report

- Extension: tachiyomi-fr.rimuscans-v1.4.35
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 203984087587807085
- Source name: Rimu Scans
- Source language: fr
- Selected manga input: popular offset 0: Boundless Necromancer (`.../boundless-necromancer`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 24 | Boundless Necromancer (`.../boundless-necromancer`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 24 | The Greatest Estate Developer (`.../the-greatest-estate-developer`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 24 | Second Life Ranker (`.../second-life-ranker`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 24 | Blue Lock (`.../blue-lock`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Boundless Necromancer (`.../boundless-necromancer`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Boundless Necromancer (`.../boundless-necromancer`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 177 | Chapitre 1 (`.../1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 14 |  |  | 1-10s |

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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Boundless Necromancer, URL=`.../boundless-necromancer` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=Blue Lock, URL=`.../blue-lock` at page 1 offset 16 and page 2 offset 0, title=Top Tier Providence, URL=`.../top-tier-providence` at page 1 offset 17 and page 2 offset 1, title=The Tutorial Is Too Hard, URL=`.../the-tutorial-is-too-hard` at page 1 offset 18 and page 2 offset 2, title=The Greatest Estate Developer, URL=`.../the-greatest-estate-developer` at page 1 offset 19 and page 2 offset 3, title=You Think It's Easy Rewriting a Story?, URL=`.../you-think-it-s-easy-rewriting-a-story` at page 1 offset 20 and page 2 offset 4, title=Tales Of Demons And Gods, URL=`.../tales-of-demons-and-gods` at page 1 offset 21 and page 2 offset 5, title=The Villain's Daughter Plans to Run Away, URL=`.../the-villain-s-daughter-plans-to-run-away` at page 1 offset 22 and page 2 offset 6, title=The Hero Returns, URL=`.../the-hero-returns` at page 1 offset 23 and page 2 offset 7 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://rimuscan.fr/.../cover.webp` (image/webp (encoding: lossy), 24600 bytes, 300x429) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../boundless-necromancer` |  |  |  |
| details thumbnail URL | PASS | `https://rimuscan.fr/.../cover.webp` |  |  |  |
| details author | PASS | N/A |  |  |  |
| details artist | PASS | N/A |  |  |  |
| details genres | PASS | Manhwa, Action, Aventure, Martial Arts |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | \[Par le studio à l’origine de et !\]<br>Jamais auparavant, je n’aurais pensé pouvoir devenir un chasseur.<br>Je ne croyais pas en avoir la chance.<br>Et pourtant, ce ne fut pas le cas.<br>「 La Tour des épreuves a sélectionné tous les candidats potentiels sur Terre. 」<br>「 Veuillez sélectionner votre niveau de difficulté. 」<br>「 La difficulté choisie sera en corrélation directe avec vos récompenses. 」<br>On m’a donné une occasion à présent.<br>Une occasion en or qui plus est. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 177 chapters |  |  |  |
| chapter dates | PASS | 177 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 14 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://rimuscan.fr/.../001.webp <redacted query values: v>` (image/webp (encoding: lossy), 98466 bytes, 1200x800) |  |  |  |
