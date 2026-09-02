# Extension Validation Report

- Extension: tachiyomi-it.tuttoanimemanga-v1.6.10
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 30
- Lint: 0
- Warnings: 0
- Skipped: 5
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2102507871480604746
- Source name: TuttoAnimeManga
- Source language: it
- Selected manga input: popular offset 0: 1/2 Principe (`.../12_principe`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 116 | 1/2 Principe (`.../12_principe`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 10 | The Promised Neverland (`.../the_promised_neverland`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 404 | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 1/2 Principe (`.../12_principe`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 81 | Sidestory (`.../it`) |  | <1s |
| pages | `getPageList(chapter)` | success | 31 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 404 | REVIEW | INSUFFICIENT_EVIDENCE |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 116 entries |  |  |  |
| latest listing | PASS | 10 entries |  |  |  |
| search listing | SKIP | HTTP error 404 |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 126/126 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 126/126 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://tuttoanimemanga.net/.../b70893df-7efe-49fb-934d-08c9fbbe5ade.jpg <redacted query values: v>` (image/jpeg, 550919 bytes, 1269x1800) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../12_principe` |  |  |  |
| details thumbnail URL | PASS | `https://tuttoanimemanga.net/.../b70893df-7efe-49fb-934d-08c9fbbe5ade.jpg <redacted query values: v>` |  |  |  |
| details author | PASS | Yu Wo |  |  |  |
| details artist | PASS | Choi Hong Chong |  |  |  |
| details genres | PASS | Action, Adventure, Comedy, Fantasy, Romance, Sci-Fi |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Corre l'anno 2100 d.C. sulla Terra. Gli umani hanno inventato un gioco di ruolo virtuale che raggiunge una percentuale di realismo del 99%, rendendo l'esperienza quasi identica alla vita reale. Feng Lan, a causa di una scommessa con il fratello, decide di vincere il gioco senza usufruire dei benefici che vengono dati a tutte le ragazze. Per questo, diventa il primo "travestito" del gioco di ruolo "Second Life". Ma da ragazzo, Feng Lan è tanto bella da venir costantemente assalita dalle altre giocatrici che cercano di farla diventare il loro ragazzo. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 81 chapters |  |  |  |
| chapter dates | PASS | 81 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 31 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://tuttoanimemanga.net/.../01.jpg <redacted query values: v>` (image/jpeg, 203944 bytes, 796x1200) |  |  |  |
