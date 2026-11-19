# Extension Validation Report

- Extension: tachiyomi-pt.lapkzone-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 36
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2486730738614814870
- Source name: Lapkzone
- Source language: pt-BR
- Selected manga input: latest offset 0: Hoje a Gyaru Dá a Aula (`.../hoje-a-gyaru-da-a-aula`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Lanche da Aula (`.../lanche-da-aula`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 20 | Mulher Sem Pau Já É Bom, Imagina Com (`.../mulher-com-pau`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 40 | Hoje a Gyaru Dá a Aula (`.../hoje-a-gyaru-da-a-aula`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 40 | Imperial Chicken (`.../imperial-chicken`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Hoje a Gyaru Dá a Aula (`.../hoje-a-gyaru-da-a-aula`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Hoje a Gyaru Dá a Aula (`.../hoje-a-gyaru-da-a-aula`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Capítulo Único (`.../hoje-a-gyaru-da-a-aula`) |  | <1s |
| pages | `getPageList(chapter)` | success | 27 |  |  | 1-10s |

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
| latest listing | PASS | 40 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Hoje a Gyaru Dá a Aula, URL=`hoje-a-gyaru-da-a-aula` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 121/121 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 121/121 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://lapkzone.com/.../Ero-Gal-Sakusei-Gyaku-Seishidou-Ero-Gals-Cum-Milking-Reverse-Sex-Guidance-Hoje-a-Gyaru-Da-a-Aula.28.webp` (image/webp (container: extended), 27836 bytes, 320x420) |  |  |  |
| details identity | PASS | Details preserved selected URL `hoje-a-gyaru-da-a-aula` |  |  |  |
| details thumbnail URL | PASS | `https://lapkzone.com/.../Ero-Gal-Sakusei-Gyaku-Seishidou-Ero-Gals-Cum-Milking-Reverse-Sex-Guidance-Hoje-a-Gyaru-Da-a-Aula.28.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Hentai Exclusivo, HQ DE SEXO, One-Shot, Ahegao, Ambiente escolar, Bunda Grande, Creampie, EXCLUSIVA, Gyaru, Masturbação, Peitos grandes, Professor, Provocação, Sexo Anal, Sexo Oral, Sexo Vaginal, VIRGEM |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | No Colégio Kouguchi, Mia Shinozaki precisa se preparar para a prova de recuperação. Durante uma aula particular, ela toma a iniciativa e inverte os papéis com o professor.<br><br>A situação continua no dormitório feminino, onde os encontros se tornam cada vez mais frequentes. Enquanto isso, o professor usa os costumes do colégio para justificar suas atitudes, mesmo sabendo que ultrapassa os limites profissionais. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 27 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://lapkzone.com/.../Ero-Gal-Sakusei-Gyaku-Seishidou-Ero-Gals-Cum-Milking-Reverse-Sex-Guidance-Hoje-a-Gyaru-Da-a-Aula.1.webp` (image/webp (encoding: lossy), 182100 bytes, 1280x1807) |  |  |  |
