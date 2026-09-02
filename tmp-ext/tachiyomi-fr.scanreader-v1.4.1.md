# Extension Validation Report

- Extension: tachiyomi-fr.scanreader-v1.4.1
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 34
- Lint: 0
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6450715347254021327
- Source name: Scan Reader
- Source language: fr
- Selected manga input: latest offset 0: War of Corpses (`.../war-of-corpses`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 8 | Lucky Mia! (`.../lucky-mia`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 13 | What Can I Do Alone ? (`.../what-can-i-do-alone`) |  | 10s+ |
| latest | `fetchLatestUpdates(1)` | success | 10 | War of Corpses (`.../war-of-corpses`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 10 | The Saint Levels Up Through Necromancy (`.../the-saint-levels-up-through-necromancy`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 2 | War of Corpses (`.../war-of-corpses`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | War of Corpses (`.../war-of-corpses`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 9 | Chapitre 1 (`.../chapitre-1-201`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 13 |  |  | 1-10s |

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
| popular listing | PASS | 8 entries |  |  |  |
| latest listing | PASS | 10 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=War of Corpses, URL=`.../war-of-corpses` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | UNUSUAL | Overlapping manga: title=Revenge of the Iron-Blooded Sword Hound, URL=`.../return-of-the-iron-blooded-sword-hound` at page 1 offset 6 and page 2 offset 8 |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 43/43 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 43/43 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://scanreader.net/.../War of Corpses-cover-200x300.jpeg` (image/jpeg, 17562 bytes, 200x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../war-of-corpses` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://scanreader.net/.../War%20of%20Corpses-cover.jpeg` (image/jpeg, 69887 bytes, 400x600) |  |  |  |
| details author | PASS | Mayo Raccoon |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Uce, un jeune homme malchanceux, rêve de devenir le champion de la brutale et légendaire War of Corpses, un sport où les nécromanciens et les chevaliers se battent pour la suprématie. Lors d’une tentative désespérée, il réanime Eleonora, un cadavre abandonné qui semblait appartenir à la plus grande mercenaire meurtrière au monde, il y a cependant deux gros problèmes. Premièrement, Eleonora est vivante, c’est un fait qui, à aucun prix, ne doit-être révélé. Deuxièmement, elle et Uce n’arrivent pas à coordonner leurs mouvements. Est-ce que ce duo improbable parviendra-t-il à surmonter tous les obstacles à venir, gagner la War of Corpses et prouver que tout le monde à tort ? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 9 chapters |  |  |  |
| chapter dates | PASS | 9 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 13 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://scanreader.net/.../war-of-corpses-chap-1.0-p1.jpeg` (image/jpeg, 230337 bytes, 800x1200) |  |  |  |
