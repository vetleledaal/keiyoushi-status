# Extension Validation Report

- Extension: tachiyomi-pt.revistasequadrinhos-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 33
- Lint: 2
- Warnings: 1
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1455091782657313638
- Source name: Revistas e Quadrinhos
- Source language: pt
- Selected manga input: popular offset 0: O Nerd Comedor x Dona Mama – Juntando As Famílias (`.../o-nerd-comedor-x-dona-mama-juntando-as-familias`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | O Nerd Comedor x Dona Mama – Juntando As Famílias (`.../o-nerd-comedor-x-dona-mama-juntando-as-familias`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Os Sacanas Petiscos 13 – Dormindo no meio do casal (`.../os-sacanas-petiscos-13-dormindo-no-meio-do-casal`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | O Nerd Comedor x Dona Mama – Juntando As Famílias (`.../o-nerd-comedor-x-dona-mama-juntando-as-familias`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Papito Snacks 05 – Gordurinha das boas (`.../papito-snacks-05-gordurinha-das-boas`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | O Nerd Comedor x Dona Mama – Juntando As Famílias (`.../o-nerd-comedor-x-dona-mama-juntando-as-familias`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Capítulo Único (`.../o-nerd-comedor-x-dona-mama-juntando-as-familias`) |  | <1s |
| pages | `getPageList(chapter)` | success | 25 |  |  | 1-10s |

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
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 96/96 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 96/96 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://revistasequadrinhos.com/.../CAPA-NCxDM1.webp` (image/webp (encoding: lossy), 25642 bytes, 248x320) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../o-nerd-comedor-x-dona-mama-juntando-as-familias` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Comics, Erotic Comic, HQ ADULTO, Popular Comics, TF-BR, anal, boquete, Dona Mama, Gangbang, grandes paus, incesto, loiras, o nerd, peitos grandes, Porra |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | LINT | Description is empty; use null when unknown |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 25 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://revistasequadrinhos.com/.../popular-comics` to `https://revistasequadrinhos.com/.../popular-comics` (1 redirects); popular: `https://revistasequadrinhos.com/.../2` to `https://revistasequadrinhos.com/.../2` (1 redirects); popular: `https://revistasequadrinhos.com/.../2` to `https://revistasequadrinhos.com/.../2` (1 redirects) |  |  |  |
| page load | PASS | `https://revistasequadrinhos.com/.../1-NCxDM1-_1_.webp` (image/webp (encoding: lossy), 376096 bytes, 1440x1920) |  |  |  |
