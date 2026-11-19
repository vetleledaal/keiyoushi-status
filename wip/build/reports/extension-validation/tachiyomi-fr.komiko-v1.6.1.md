# Extension Validation Report

- Extension: tachiyomi-fr.komiko-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 35
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: komiko
- Source ID: 7861579738676845652
- Source name: Komiko
- Source language: fr
- Selected manga input: popular offset 0: The Fed-Up Office Lady Wants to Serve the Villainess - Tome 01 (`.../1912`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 48 | The Fed-Up Office Lady Wants to Serve the Villainess - Tome 01 (`.../1912`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 48 | Magical Buffs : L'éveil de l'enchanteur polyvalent - Tome 06 (`.../1491`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 48 | The Condemned Villainess Goes Back in Time - Tome 05 (`.../1897`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 48 | Silver Plan : Ma seconde chance - Tome 07 (`.../873`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | The Fed-Up Office Lady Wants to Serve the Villainess - Tome 01 (`.../1912`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | The Fed-Up Office Lady Wants to Serve the Villainess - Tome 01 (`.../1912`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Extrait (`.../1912`) |  | <1s |
| pages | `getPageList(chapter)` | success | 10 |  |  | <1s |

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
| popular listing | PASS | 48 entries |  |  |  |
| latest listing | PASS | 48 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Fed-Up Office Lady Wants to Serve the Villainess - Tome 01, URL=`the-fedup-office-lady-wants-to-serve-the-villainess-tome-01-livre/1912` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 193/193 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 193/193 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://media.komiko.io/.../1912.webp` (image/webp (encoding: lossy), 82038 bytes, 400x568) |  |  |  |
| details identity | PASS | Details preserved selected URL `the-fedup-office-lady-wants-to-serve-the-villainess-tome-01-livre/1912` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://media.komiko.io/.../1912.webp` (image/webp (encoding: lossy), 810648 bytes, 1524x2162) |  |  |  |
| details author | PASS | Nekotarou |  |  |  |
| details artist | PASS | Nekotarou |  |  |  |
| details genres | PASS | Isekai, Romance, Comédie |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Seinen · 12 ans et plus<br><br>**Une jeune employée de bureau épuisée se fait virer et se retrouve au service de la vilaine cruelle et sans pitié ?!**<br><br>**Dans le classement 2024 et 2025 des mangas dont l'adaptation animée est la plus attendue !**<br><br>Midori Natori, une jeune intérimaire dévouée, travaille dur pour son entreprise jusqu'au jour où son employeur décide, de manière injuste, de mettre fin à son contrat.<br>" N'y a-t-il vraiment personne qui ait besoin de moi ? "<br>Alors qu'elle est au bord du gouffre, elle se retrouve soudainement invoquée en tant que familier dans son<br>jeu préféré Fairy Tale of Jewels. Pour ne rien arranger, sa maîtresse n'est autre que Lapis Tenebrae, la méchante qui piège tous les autres personnages !<br>Mais alors que Natori met à profit ses connaissances pour épargner à son employeuse un destin funeste, voilà qu'elle s'attire les faveurs de cette dernière...<br><br>**Natori, ancienne employée de bureau, va tout faire pour éviter une fin tragique à ses personnages préférés !** |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 10 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://extrait.komiko.io/.../1.webp <redacted query values: 1790260480>` (image/webp (encoding: lossy), 452418 bytes, 1410x2000) |  |  |  |
