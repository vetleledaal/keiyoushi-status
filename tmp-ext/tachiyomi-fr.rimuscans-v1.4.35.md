# Extension Validation Report

- Extension: tachiyomi-fr.rimuscans-v1.4.35
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 35
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
- Selected manga input: latest offset 0: Genius Prismatic Mage (`.../genius-prismatic-mage`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 24 | Boundless Necromancer (`.../boundless-necromancer`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 24 | The Legendary Hero is an Academy Honors Student (`.../the-legendary-hero-is-an-academy-honors-student`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 24 | Genius Prismatic Mage (`.../genius-prismatic-mage`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 24 | The Indomitable Martial King (`.../the-indomitable-martial-king`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Genius Prismatic Mage (`.../genius-prismatic-mage`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Genius Prismatic Mage (`.../genius-prismatic-mage`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 87 | Chapitre 1 (`.../1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 25 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Genius Prismatic Mage, URL=`.../genius-prismatic-mage` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=MookHyang – Dark Lady, URL=`.../mookhyang-dark-lady` at page 1 offset 3 and page 2 offset 3, title=Rise of the Mushroom King, URL=`.../rise-of-the-mushroom-king` at page 1 offset 12 and page 2 offset 20, title=Regressing as the Reincarnated Bastard of the Sword Clan, URL=`.../regressing-as-the-reincarnated-bastard-of-the-sword-clan` at page 1 offset 15 and page 2 offset 19, title=Solo Resurrection, URL=`.../solo-resurrection` at page 1 offset 17 and page 2 offset 17, title=Martial Evolution, URL=`.../martial-evolution` at page 1 offset 23 and page 2 offset 12 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://rimuscan.fr/.../cover-1776983611251.webp` (image/webp (encoding: lossy), 351582 bytes, 1792x2560) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../genius-prismatic-mage` |  |  |  |
| details thumbnail URL | PASS | `https://rimuscan.fr/.../cover-1776983611251.webp` |  |  |  |
| details author | PASS | Ice Coffee,Sewer |  |  |  |
| details artist | PASS | Cancan |  |  |  |
| details genres | PASS | Manhwa, Combat, Vengeance, Fantastique, Aventure, Action |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Dans les bidonvilles vivait un jeune garçon nommé Ray qui était dépourvu d'émotions.<br><br>Il acquit soudainement la capacité de voir des « couleurs » que personne d'autre ne pouvait voir, et il avait le pouvoir de les contrôler.<br><br>Un jour, il perdit son abri, un passage souterrain, et ses amis à cause d'un magicien. Il perdit même Niles, en qui il avait cru et qu'il avait suivi.<br><br>Le garçon sans émotions jura de se venger et commença sa quête pour retrouver ses émotions. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 87 chapters |  |  |  |
| chapter dates | PASS | 87 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 25 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://rimuscan.fr/.../001.webp <redacted query values: v>` (image/webp (encoding: lossy), 131206 bytes, 800x1200) |  |  |  |
