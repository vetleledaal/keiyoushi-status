# Extension Validation Report

- Extension: tachiyomi-fr.poseidonscans-v1.4.51
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 34
- Lint: 0
- Warnings: 0
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8936307069044646761
- Source name: Poseidon Scans
- Source language: fr
- Selected manga input: latest offset 0: 30 Years Since the Prologue (`.../30-years-since-the-prologue`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 6 | Pick Me Up (`.../pick-me-up-2334`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 16 | 30 Years Since the Prologue (`.../30-years-since-the-prologue`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 16 | Catastrophic Necromancer (`.../catastrophic-necromancer`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 30 Years Since the Prologue (`.../30-years-since-the-prologue`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | 30 Years Since the Prologue (`.../30-years-since-the-prologue`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 5 | Chapitre 1 - Prologue (`.../1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 60 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 6 entries |  |  |  |
| latest listing | PASS | 16 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=30 Years Since the Prologue, URL=`.../30-years-since-the-prologue` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 39/39 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 39/39 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://poseidon-scans.net/.../30-years-since-the-prologue.webp` (image/webp (encoding: lossy), 122308 bytes, 1038x1516) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../30-years-since-the-prologue` |  |  |  |
| details thumbnail URL | PASS | `https://poseidon-scans.net/.../30-years-since-the-prologue.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Combat, Académie, Fantaisie, Magie, Réincarnation, Tragique, Aventure |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | par le studio qui vous à apporter \[The Extra’s Academy Survival Guide\] et \[I Killed an Academy Player\]<br><br>Je me suis retrouvé transporté dans un jeu que je n’avais jamais vu auparavant.<br><br>Je pensais que c’était un RPG de premier ordre et j’y ai passé 30 ans.<br><br>J’ai pris ma retraite en héros de guerre et j’avais l’intention de passer le reste de ma vie à me détendre.<br><br>Mais en fait, c’était une histoire se déroulant dans une académie ? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 5 chapters |  |  |  |
| chapter dates | PASS | 5 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 60 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://poseidon-scans.net/.../97765dc8-1d1f-4395-9523-b54ec1d6a992` (image/webp (encoding: lossy), 202258 bytes, 800x5000) |  |  |  |
